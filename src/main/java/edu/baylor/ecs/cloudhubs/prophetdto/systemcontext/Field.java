package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import lombok.Data;

@Data
public class Field {

    private Name name;

    private String type;

    private Set<Annotation> annotations = new HashSet<>();

    private boolean isReference;

    private String entityRefName;

    public Field clone(){
        // need to change the entity reference later to the new entity
        return new Field(this.getName(), this.getType(), this.getAnnotations(),
                this.isReference(), this.getEntityRefName(), this.isCollection());
    }

    private boolean isCollection;

    public Field(){}

    public Field(String type, Name name) {
        this.type = type;
        this.name = name;
    }

    public Field(String type, String name){
        this.type = type;
        this.name = new Name(name);
    }

    public Field(Name name, String type, Set<Annotation> annotations) {
        this.name = new Name(name);
        this.type = type;
        this.annotations = annotations;
    }

    public Field(Name name, String type, Set<Annotation> annotations, boolean isReference, String entityRefName, boolean isCollection) {
        this.name = new Name(name);
        this.type = type;
        this.annotations = annotations;
        this.isReference = isReference;
        this.entityRefName = entityRefName;
        this.isCollection = isCollection;
    }

    @Override
    public String toString() {
        return "Field{" +
                "name='" + name.getName() + '\'' +
                ", type='" + type + '\'' +
                ", isReference=" + isReference +
                '}';
    }
}
