package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.jparser;

import edu.baylor.ecs.ciljssa.component.Component;
import edu.baylor.ecs.ciljssa.component.context.AnalysisContext;
import edu.baylor.ecs.ciljssa.component.impl.ClassComponent;
import edu.baylor.ecs.ciljssa.component.impl.DirectoryComponent;
import edu.baylor.ecs.ciljssa.component.impl.FieldComponent;
import edu.baylor.ecs.ciljssa.component.impl.ModuleComponent;
import edu.baylor.ecs.ciljssa.factory.context.AnalysisContextFactory;
import edu.baylor.ecs.ciljssa.factory.directory.DirectoryFactory;
import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.Annotation;
import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.Entity;
import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.Field;
import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.Module;
import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.SystemContext;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SystemContextParser {

    private static SystemContextParser INSTANCE;

    private static DirectoryFactory directoryFactory;
    private static AnalysisContextFactory contextFactory;

    /**
     * Singleton instance getter
     * @return gets this instance of systemcontextparser
     */
    public static SystemContextParser getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SystemContextParser();
        }
        return INSTANCE;
    }

    private SystemContextParser() {
        directoryFactory = new DirectoryFactory();
        contextFactory = new AnalysisContextFactory();
    }

    public static AnalysisContext createAnalysisContextFromDirectory(String path) {
        DirectoryComponent directory = (DirectoryComponent) directoryFactory.createDirectoryGraph(path);
        return contextFactory.createAnalysisContextFromDirectoryGraph(directory);
    }

    public static AnalysisContext createAnalysisContextFromFile(File file) {
        DirectoryComponent directory = (DirectoryComponent) directoryFactory.createDirectoryGraphOfFile(file);
        return contextFactory.createAnalysisContextFromDirectoryGraph(directory);
    }

    public static AnalysisContext createAnalysisContextFromFile(String filePath) {
        DirectoryComponent directory = (DirectoryComponent) directoryFactory
                .createDirectoryGraphOfFile(new File(filePath));
        return contextFactory.createAnalysisContextFromDirectoryGraph(directory);
    }

    public static SystemContext createSystemContextFromAnalysisContext(AnalysisContext context) {
        // Create tree of modules
        List<Module> modules = new ArrayList<>();
        for (ModuleComponent module : context.getModules()) {
            Module module_n = new Module();
            List<Entity> entities = new ArrayList<>();
            for (ClassComponent clazz : module.getClasses()) {
                List<Field> fields = new ArrayList<>();
                for (FieldComponent field : clazz.getFieldComponents()) {
                    Field field_n = new Field();
                    field_n.setName(field.getFieldName());
                    field_n.setType(field.getType());
                    Set<Annotation> annotations = new HashSet<>();
                    for (Component annotation : field.getAnnotations()) {
                        Annotation ann = new Annotation();
                        ann.setStringValue(annotation.asAnnotationComponent().getAnnotationValue());
                        ann.setName(annotation.asAnnotationComponent().getAsString());
                        annotations.add(ann);
                    }
                    field_n.setAnnotations(annotations);
                    fields.add(field_n);
                }
                Entity entity = new Entity();
                entity.setFields(fields);
                entity.setEntityName(clazz.getClassName());
                entities.add(entity);
            }
            module_n.setName(module.getInstanceName());
            module_n.setEntities(entities);
            modules.add(module_n);
        }
        // Create result from system name and modules
        return new SystemContext(context.getRootPath(), modules);
    }

    public static void main(String[] args) {
        SystemContext context = createSystemContextFromAnalysisContext(createAnalysisContextFromDirectory("fake"));
    }

}
