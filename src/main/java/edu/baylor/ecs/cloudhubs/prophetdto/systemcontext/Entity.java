package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import lombok.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Entity {

    @NonNull
    private String entityName;

    private List<edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.Field> fields = new LinkedList<>();

    public Entity(@NonNull String entityName) {
        this.entityName = entityName;
    }

    public Entity(@NonNull String entityName, List<Field> fields) {
        this.entityName = entityName;
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(entityName, entity.entityName) &&
                Objects.equals(fields, entity.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityName, fields);
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
