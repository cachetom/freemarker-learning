package freemarker.ext.beans;

import java.util.Set;

import freemarker.template.template_model.TemplateCollectionModel;

/**
 * @author Attila Szegedi
 */
class SetAdapter extends CollectionAdapter implements Set {
    SetAdapter(TemplateCollectionModel model, BeansWrapper wrapper) {
        super(model, wrapper);
    }
}
