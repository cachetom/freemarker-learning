/* Generated By:JavaCC: Do not edit this line. FMParserConstants.java */
package freemarker.core;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface FMParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int BLANK = 1;
  /** RegularExpression Id. */
  int START_TAG = 2;
  /** RegularExpression Id. */
  int END_TAG = 3;
  /** RegularExpression Id. */
  int CLOSE_TAG1 = 4;
  /** RegularExpression Id. */
  int CLOSE_TAG2 = 5;
  /** RegularExpression Id. */
  int ATTEMPT = 6;
  /** RegularExpression Id. */
  int RECOVER = 7;
  /** RegularExpression Id. */
  int IF = 8;
  /** RegularExpression Id. */
  int ELSE_IF = 9;
  /** RegularExpression Id. */
  int LIST = 10;
  /** RegularExpression Id. */
  int FOREACH = 11;
  /** RegularExpression Id. */
  int SWITCH = 12;
  /** RegularExpression Id. */
  int CASE = 13;
  /** RegularExpression Id. */
  int ASSIGN = 14;
  /** RegularExpression Id. */
  int GLOBALASSIGN = 15;
  /** RegularExpression Id. */
  int LOCALASSIGN = 16;
  /** RegularExpression Id. */
  int _INCLUDE = 17;
  /** RegularExpression Id. */
  int IMPORT = 18;
  /** RegularExpression Id. */
  int FUNCTION = 19;
  /** RegularExpression Id. */
  int MACRO = 20;
  /** RegularExpression Id. */
  int TRANSFORM = 21;
  /** RegularExpression Id. */
  int VISIT = 22;
  /** RegularExpression Id. */
  int STOP = 23;
  /** RegularExpression Id. */
  int RETURN = 24;
  /** RegularExpression Id. */
  int CALL = 25;
  /** RegularExpression Id. */
  int SETTING = 26;
  /** RegularExpression Id. */
  int COMPRESS = 27;
  /** RegularExpression Id. */
  int COMMENT = 28;
  /** RegularExpression Id. */
  int TERSE_COMMENT = 29;
  /** RegularExpression Id. */
  int NOPARSE = 30;
  /** RegularExpression Id. */
  int END_IF = 31;
  /** RegularExpression Id. */
  int END_LIST = 32;
  /** RegularExpression Id. */
  int END_RECOVER = 33;
  /** RegularExpression Id. */
  int END_ATTEMPT = 34;
  /** RegularExpression Id. */
  int END_FOREACH = 35;
  /** RegularExpression Id. */
  int END_LOCAL = 36;
  /** RegularExpression Id. */
  int END_GLOBAL = 37;
  /** RegularExpression Id. */
  int END_ASSIGN = 38;
  /** RegularExpression Id. */
  int END_FUNCTION = 39;
  /** RegularExpression Id. */
  int END_MACRO = 40;
  /** RegularExpression Id. */
  int END_COMPRESS = 41;
  /** RegularExpression Id. */
  int END_TRANSFORM = 42;
  /** RegularExpression Id. */
  int END_SWITCH = 43;
  /** RegularExpression Id. */
  int ELSE = 44;
  /** RegularExpression Id. */
  int BREAK = 45;
  /** RegularExpression Id. */
  int SIMPLE_RETURN = 46;
  /** RegularExpression Id. */
  int HALT = 47;
  /** RegularExpression Id. */
  int FLUSH = 48;
  /** RegularExpression Id. */
  int TRIM = 49;
  /** RegularExpression Id. */
  int LTRIM = 50;
  /** RegularExpression Id. */
  int RTRIM = 51;
  /** RegularExpression Id. */
  int NOTRIM = 52;
  /** RegularExpression Id. */
  int DEFAUL = 53;
  /** RegularExpression Id. */
  int SIMPLE_NESTED = 54;
  /** RegularExpression Id. */
  int NESTED = 55;
  /** RegularExpression Id. */
  int SIMPLE_RECURSE = 56;
  /** RegularExpression Id. */
  int RECURSE = 57;
  /** RegularExpression Id. */
  int FALLBACK = 58;
  /** RegularExpression Id. */
  int ESCAPE = 59;
  /** RegularExpression Id. */
  int END_ESCAPE = 60;
  /** RegularExpression Id. */
  int NOESCAPE = 61;
  /** RegularExpression Id. */
  int END_NOESCAPE = 62;
  /** RegularExpression Id. */
  int UNIFIED_CALL = 63;
  /** RegularExpression Id. */
  int UNIFIED_CALL_END = 64;
  /** RegularExpression Id. */
  int FTL_HEADER = 65;
  /** RegularExpression Id. */
  int TRIVIAL_FTL_HEADER = 66;
  /** RegularExpression Id. */
  int UNKNOWN_DIRECTIVE = 67;
  /** RegularExpression Id. */
  int WHITESPACE = 68;
  /** RegularExpression Id. */
  int PRINTABLE_CHARS = 69;
  /** RegularExpression Id. */
  int FALSE_ALERT = 70;
  /** RegularExpression Id. */
  int OUTPUT_ESCAPE = 71;
  /** RegularExpression Id. */
  int NUMERICAL_ESCAPE = 72;
  /** RegularExpression Id. */
  int ESCAPED_CHAR = 80;
  /** RegularExpression Id. */
  int STRING_LITERAL = 81;
  /** RegularExpression Id. */
  int RAW_STRING = 82;
  /** RegularExpression Id. */
  int FALSE = 83;
  /** RegularExpression Id. */
  int TRUE = 84;
  /** RegularExpression Id. */
  int INTEGER = 85;
  /** RegularExpression Id. */
  int DECIMAL = 86;
  /** RegularExpression Id. */
  int DOT = 87;
  /** RegularExpression Id. */
  int DOT_DOT = 88;
  /** RegularExpression Id. */
  int BUILT_IN = 89;
  /** RegularExpression Id. */
  int EXISTS = 90;
  /** RegularExpression Id. */
  int EQUALS = 91;
  /** RegularExpression Id. */
  int DOUBLE_EQUALS = 92;
  /** RegularExpression Id. */
  int NOT_EQUALS = 93;
  /** RegularExpression Id. */
  int LESS_THAN = 94;
  /** RegularExpression Id. */
  int LESS_THAN_EQUALS = 95;
  /** RegularExpression Id. */
  int ESCAPED_GT = 96;
  /** RegularExpression Id. */
  int ESCAPED_GTE = 97;
  /** RegularExpression Id. */
  int PLUS = 98;
  /** RegularExpression Id. */
  int MINUS = 99;
  /** RegularExpression Id. */
  int TIMES = 100;
  /** RegularExpression Id. */
  int DOUBLE_STAR = 101;
  /** RegularExpression Id. */
  int ELLIPSIS = 102;
  /** RegularExpression Id. */
  int DIVIDE = 103;
  /** RegularExpression Id. */
  int PERCENT = 104;
  /** RegularExpression Id. */
  int AND = 105;
  /** RegularExpression Id. */
  int OR = 106;
  /** RegularExpression Id. */
  int EXCLAM = 107;
  /** RegularExpression Id. */
  int COMMA = 108;
  /** RegularExpression Id. */
  int SEMICOLON = 109;
  /** RegularExpression Id. */
  int COLON = 110;
  /** RegularExpression Id. */
  int OPEN_BRACKET = 111;
  /** RegularExpression Id. */
  int CLOSE_BRACKET = 112;
  /** RegularExpression Id. */
  int OPEN_PAREN = 113;
  /** RegularExpression Id. */
  int CLOSE_PAREN = 114;
  /** RegularExpression Id. */
  int OPEN_BRACE = 115;
  /** RegularExpression Id. */
  int CLOSE_BRACE = 116;
  /** RegularExpression Id. */
  int IN = 117;
  /** RegularExpression Id. */
  int AS = 118;
  /** RegularExpression Id. */
  int USING = 119;
  /** RegularExpression Id. */
  int ID = 120;
  /** RegularExpression Id. */
  int OPEN_MISPLACED_INTERPOLATION = 121;
  /** RegularExpression Id. */
  int LETTER = 122;
  /** RegularExpression Id. */
  int DIGIT = 123;
  /** RegularExpression Id. */
  int DIRECTIVE_END = 124;
  /** RegularExpression Id. */
  int EMPTY_DIRECTIVE_END = 125;
  /** RegularExpression Id. */
  int NATURAL_GT = 126;
  /** RegularExpression Id. */
  int NATURAL_GTE = 127;
  /** RegularExpression Id. */
  int TERMINATING_WHITESPACE = 128;
  /** RegularExpression Id. */
  int TERMINATING_EXCLAM = 129;
  /** RegularExpression Id. */
  int TERSE_COMMENT_END = 130;
  /** RegularExpression Id. */
  int MAYBE_END = 131;
  /** RegularExpression Id. */
  int KEEP_GOING = 132;
  /** RegularExpression Id. */
  int LONE_LESS_THAN_OR_DASH = 133;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int NODIRECTIVE = 1;
  /** Lexical state. */
  int FM_EXPRESSION = 2;
  /** Lexical state. */
  int IN_PAREN = 3;
  /** Lexical state. */
  int NAMED_PARAMETER_EXPRESSION = 4;
  /** Lexical state. */
  int EXPRESSION_COMMENT = 5;
  /** Lexical state. */
  int NO_SPACE_EXPRESSION = 6;
  /** Lexical state. */
  int NO_PARSE = 7;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<BLANK>",
    "<START_TAG>",
    "<END_TAG>",
    "<CLOSE_TAG1>",
    "<CLOSE_TAG2>",
    "<ATTEMPT>",
    "<RECOVER>",
    "<IF>",
    "<ELSE_IF>",
    "<LIST>",
    "<FOREACH>",
    "<SWITCH>",
    "<CASE>",
    "<ASSIGN>",
    "<GLOBALASSIGN>",
    "<LOCALASSIGN>",
    "<_INCLUDE>",
    "<IMPORT>",
    "<FUNCTION>",
    "<MACRO>",
    "<TRANSFORM>",
    "<VISIT>",
    "<STOP>",
    "<RETURN>",
    "<CALL>",
    "<SETTING>",
    "<COMPRESS>",
    "<COMMENT>",
    "<TERSE_COMMENT>",
    "<NOPARSE>",
    "<END_IF>",
    "<END_LIST>",
    "<END_RECOVER>",
    "<END_ATTEMPT>",
    "<END_FOREACH>",
    "<END_LOCAL>",
    "<END_GLOBAL>",
    "<END_ASSIGN>",
    "<END_FUNCTION>",
    "<END_MACRO>",
    "<END_COMPRESS>",
    "<END_TRANSFORM>",
    "<END_SWITCH>",
    "<ELSE>",
    "<BREAK>",
    "<SIMPLE_RETURN>",
    "<HALT>",
    "<FLUSH>",
    "<TRIM>",
    "<LTRIM>",
    "<RTRIM>",
    "<NOTRIM>",
    "<DEFAUL>",
    "<SIMPLE_NESTED>",
    "<NESTED>",
    "<SIMPLE_RECURSE>",
    "<RECURSE>",
    "<FALLBACK>",
    "<ESCAPE>",
    "<END_ESCAPE>",
    "<NOESCAPE>",
    "<END_NOESCAPE>",
    "<UNIFIED_CALL>",
    "<UNIFIED_CALL_END>",
    "<FTL_HEADER>",
    "<TRIVIAL_FTL_HEADER>",
    "<UNKNOWN_DIRECTIVE>",
    "<WHITESPACE>",
    "<PRINTABLE_CHARS>",
    "<FALSE_ALERT>",
    "\"${\"",
    "\"#{\"",
    "<token of kind 73>",
    "<token of kind 74>",
    "<token of kind 75>",
    "\">\"",
    "\"]\"",
    "\"-\"",
    "<token of kind 79>",
    "<ESCAPED_CHAR>",
    "<STRING_LITERAL>",
    "<RAW_STRING>",
    "\"false\"",
    "\"true\"",
    "<INTEGER>",
    "<DECIMAL>",
    "\".\"",
    "\"..\"",
    "\"?\"",
    "\"??\"",
    "\"=\"",
    "\"==\"",
    "\"!=\"",
    "<LESS_THAN>",
    "<LESS_THAN_EQUALS>",
    "<ESCAPED_GT>",
    "<ESCAPED_GTE>",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"**\"",
    "\"...\"",
    "\"/\"",
    "\"%\"",
    "<AND>",
    "<OR>",
    "\"!\"",
    "\",\"",
    "\";\"",
    "\":\"",
    "\"[\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"in\"",
    "\"as\"",
    "\"using\"",
    "<ID>",
    "<OPEN_MISPLACED_INTERPOLATION>",
    "<LETTER>",
    "<DIGIT>",
    "\">\"",
    "<EMPTY_DIRECTIVE_END>",
    "\">\"",
    "\">=\"",
    "<TERMINATING_WHITESPACE>",
    "<TERMINATING_EXCLAM>",
    "<TERSE_COMMENT_END>",
    "<MAYBE_END>",
    "<KEEP_GOING>",
    "<LONE_LESS_THAN_OR_DASH>",
  };

}
