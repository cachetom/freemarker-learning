/*
 * Copyright (c) 2003 The Visigoth Software Society. All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowledgement:
 *       "This product includes software developed by the
 *        Visigoth Software Society (http://www.visigoths.org/)."
 *    Alternately, this acknowledgement may appear in the software itself,
 *    if and wherever such third-party acknowledgements normally appear.
 *
 * 4. Neither the name "FreeMarker", "Visigoth", nor any of the names of the 
 *    project contributors may be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact visigoths@visigoths.org.
 *
 * 5. Products derived from this software may not be called "FreeMarker" or "Visigoth"
 *    nor may "FreeMarker" or "Visigoth" appear in their names
 *    without prior written permission of the Visigoth Software Society.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE VISIGOTH SOFTWARE SOCIETY OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Visigoth Software Society. For more
 * information on the Visigoth Software Society, please see
 * http://www.visigoths.org/
 */

package freemarker.core.nodes;

import com.sun.xml.internal.xsom.impl.scd.SimpleCharStream;
import freemarker.core.Environment;
import freemarker.core.ParameterRole;
import freemarker.core.exception.ParseException;
import freemarker.core.exception._MiscTemplateException;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.template_model.TemplateModel;
import freemarker.template.template_model.TemplateScalarModel;
import freemarker.template.utility.StringUtil;

import java.io.IOException;
import java.io.StringReader;

public final class StringLiteral extends Expression implements TemplateScalarModel {
    
    private final String value;
    private TemplateElement dynamicValue;
    
    StringLiteral(String value) {
        this.value = value;
    }
    
    void checkInterpolation() throws ParseException {
        if (value.length() > 3 && (value.indexOf("${") >= 0 || value.indexOf("#{") >= 0)) {
            SimpleCharStream scs = new SimpleCharStream(new StringReader(value), beginLine, beginColumn+1, value.length());
            FMParserTokenManager token_source = new FMParserTokenManager(scs);
            token_source.onlyTextOutput = true;
            FMParser parser = new FMParser(token_source);
            parser.setTemplate(getTemplate());
            try {
                dynamicValue = parser.FreeMarkerText();
            }
            catch(ParseException e) {
                e.setTemplateName(getTemplate().getName());
                throw e;
            }
            this.constantValue = null;
        }
    }
    
   public TemplateModel _eval(Environment env) throws TemplateException {
        return new SimpleScalar(evalAndCoerceToString(env));
    }

    public String getAsString() {
        return value;
    }
    
    /**
     * Tells if this is something like <tt>"${foo}"</tt>, which is usually a user mistake.
     */
    public boolean isSingleInterpolationLiteral() {
        return dynamicValue != null && dynamicValue.getChildCount() == 1
                && dynamicValue.getChildAt(0) instanceof DollarVariable;
    }

    public String evalAndCoerceToString(Environment env) throws TemplateException {
        if (dynamicValue == null) {
            return value;
        } 
        else {
            TemplateExceptionHandler teh = env.getTemplateExceptionHandler();
            env.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            try {
               return env.renderElementToString(dynamicValue);
            }
            catch (IOException ioe) {
                throw new _MiscTemplateException(ioe, env);
            }
            finally {
                env.setTemplateExceptionHandler(teh);
            }
        }
    }

    public String getCanonicalForm() {
        return "\"" + StringUtil.FTLStringLiteralEnc(value) + "\""; 
    }
    
    public String getNodeTypeSymbol() {
        return dynamicValue == null ? getCanonicalForm() : "dynamic \"...\"";
    }
    
    public boolean isLiteral() {
        return dynamicValue == null;
    }

    protected Expression deepCloneWithIdentifierReplaced_inner(
            String replacedIdentifier, Expression replacement, ReplacemenetState replacementState) {
        StringLiteral cloned = new StringLiteral(value);
        // FIXME: replacedIdentifier should be searched inside interpolatedOutput too:
        cloned.dynamicValue = this.dynamicValue;
        return cloned;
    }

    public int getParameterCount() {
        return 1;
    }

    public Object getParameterValue(int idx) {
        if (idx != 0) throw new IndexOutOfBoundsException();
        return dynamicValue;
    }

    public ParameterRole getParameterRole(int idx) {
        if (idx != 0) throw new IndexOutOfBoundsException();
        return ParameterRole.EMBEDDED_TEMPLATE;
    }
    
}
