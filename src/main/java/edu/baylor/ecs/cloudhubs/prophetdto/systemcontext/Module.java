package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import java.util.*;

public class Module implements Cloneable {

    private String name;

    private Set<Entity> entities;

    @Override
    public Module clone() throws CloneNotSupportedException {
        super.clone();
        Map<Entity, Entity> oldToNew = new HashMap<>();
        Set<Entity> entitySet = new HashSet<>();
        this.getEntities().forEach(x ->
        {
            try {
                Entity newEnt = x.clone();
                oldToNew.put(x, newEnt);
                entitySet.add(newEnt);
            }catch(CloneNotSupportedException e){
            }
        });

        // now fix the entity references
        for(Entity e: entitySet){
            for (Field f : e.getFields()) {
                if (Objects.nonNull(f.getEntityReference())) {
                    f.setEntityReference(oldToNew.get(f.getEntityReference()));
                }
            }
        }
        return new Module(this.getName(), entitySet);
    }
    public Module(){}

    public Module(String name) {
        this.name = name;
        this.entities = new HashSet<>();
    }

    public Module( String name, Set<Entity> entities) {
        this.name = name;
        this.entities = entities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Entity> getEntities() {
        return entities;
    }

    public void setEntities(Set<Entity> entities) {
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
