package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import lombok.NonNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Field {

    @NonNull
    private String name;

    @NonNull
    private String type;

    private Set<Annotation> annotations = new HashSet<>();

    private Entity entityReference = null;

    private boolean isCollection;

    public Field(){}

    public Field(@NonNull String type, @NonNull String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return Objects.equals(name, field.name) &&
                Objects.equals(type, field.type) &&
                Objects.equals(annotations, field.annotations) &&
                Objects.equals(entityReference, field.entityReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, annotations, entityReference);
    }
}
