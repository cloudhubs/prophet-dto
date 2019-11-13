package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import lombok.*;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor
public class Module {

    @NonNull
    private String name;

    private List<Entity> entities;

    public Module(@NonNull String name) {
        this.name = name;
    }

    public Module(@NonNull String name, List<Entity> entities) {
        this.name = name;
        this.entities = entities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Module module = (Module) o;
        return Objects.equals(name, module.name) &&
                Objects.equals(entities, module.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, entities);
    }
}
