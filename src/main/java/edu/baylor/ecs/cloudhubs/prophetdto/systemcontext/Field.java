package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Field {

    private Name fieldName;

    private String type;

    private Set<Annotation> annotations = new HashSet<>();

    private Entity entityReference = null;

    private boolean isReference;

    private String entityRefName;

    public Field clone(){
        // need to change the entity reference later to the new entity
        return new Field(this.getName(), this.getType(), this.getAnnotations(), this.getEntityReference(),
                this.isReference(), this.getEntityRefName(), this.isCollection());
    }

    private boolean isCollection;

    public Field(){}

    public Field(String type, Name name) {
        this.type = type;
        this.fieldName = name;
    }

    public Field(String type, String name){
        this.type = type;
        this.fieldName = new Name(name);
    }

    public Field(Name name, String type, Set<Annotation> annotations, Entity entityReference) {
        this.fieldName = new Name(name);
        this.type = type;
        this.annotations = annotations;
        this.entityReference = entityReference;
    }

    public Field(Name name, String type, Set<Annotation> annotations, Entity entityReference, boolean isReference, String entityRefName, boolean isCollection) {
        this.fieldName = new Name(name);
        this.type = type;
        this.annotations = annotations;
        this.entityReference = entityReference;
        this.isReference = isReference;
        this.entityRefName = entityRefName;
        this.isCollection = isCollection;
    }

    public Name getName() {
        return fieldName;
    }

    public void setName(Name name) {
        this.fieldName = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Annotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Set<Annotation> annotations) {
        this.annotations = annotations;
    }

    public Entity getEntityReference() {
        return entityReference;
    }

    public void setEntityReference(Entity entityReference) {
        this.entityReference = entityReference;
    }

    public boolean isCollection() {
        return isCollection;
    }

    public void setCollection(boolean collection) {
        isCollection = collection;
    }

    public boolean isReference() {
        return isReference;
    }

    public void setReference(boolean reference) {
        isReference = reference;
    }

    public String getEntityRefName() {
        return entityRefName;
    }

    public void setEntityRefName(String entityRefName) {
        this.entityRefName = entityRefName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Field)) return false;
        Field field = (Field) o;
        return isReference() == field.isReference() &&
                isCollection() == field.isCollection() &&
                Objects.equals(getName(), field.getName()) &&
                Objects.equals(getType(), field.getType()) &&
                Objects.equals(getAnnotations(), field.getAnnotations()) &&
                Objects.equals(getEntityReference(), field.getEntityReference()) &&
                Objects.equals(getEntityRefName(), field.getEntityRefName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getType(), getAnnotations(), getEntityReference(), isReference(), getEntityRefName(), isCollection());
    }

    @Override
    public String toString() {
        return "Field{" +
                "name='" + fieldName.getName() + '\'' +
                ", type='" + type + '\'' +
                ", isReference=" + isReference +
                '}';
    }
}
