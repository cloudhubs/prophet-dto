package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Entity implements Cloneable{

    private String entityName;

    private Set<Field> fields = new HashSet<>();

    public Entity(){}

    public Entity(String entityName) {
        this.entityName = entityName;
    }

    public Entity(String entityName, Set<Field> fields) {
        this.entityName = entityName;
        this.fields = fields;
    }

    @Override
    public Entity clone() throws CloneNotSupportedException {
        super.clone();
        Set<Field> newFields = new HashSet<>(this.fields.size());
        this.getFields().forEach(x ->
        {
            try {
                newFields.add(x.clone());
            }catch(CloneNotSupportedException e){
            }
        });
        return new Entity(this.getEntityName(), newFields);
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

    public Set<Field> getFields() {
        return fields;
    }

    public void setFields(Set<Field> fields) {
        this.fields = fields;
    }
}
