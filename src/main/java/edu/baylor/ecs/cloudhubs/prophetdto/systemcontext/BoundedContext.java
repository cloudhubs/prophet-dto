package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import lombok.*;

import java.util.List;
import java.util.Objects;

public class BoundedContext {

    private String systemName;

    private List<Entity> boundedContextEntities;

    public BoundedContext(){}

    public BoundedContext(String systemName, List<Entity> boundedContextEntities) {
        this.systemName = systemName;
        this.boundedContextEntities = boundedContextEntities;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public List<Entity> getBoundedContextEntities() {
        return boundedContextEntities;
    }

    public void setBoundedContextEntities(List<Entity> boundedContextEntities) {
        this.boundedContextEntities = boundedContextEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoundedContext that = (BoundedContext) o;
        return Objects.equals(systemName, that.systemName) &&
                Objects.equals(boundedContextEntities, that.boundedContextEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemName, boundedContextEntities);
    }
}
