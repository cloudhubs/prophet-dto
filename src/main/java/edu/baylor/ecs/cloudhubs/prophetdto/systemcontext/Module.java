package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import lombok.*;

import org.apache.commons.lang3.tuple.ImmutablePair;


import java.util.*;

@NoArgsConstructor
public class Module implements Cloneable{

    @NonNull
    private String name;

    private List<Entity> entities;

    @Override
    public Module clone() throws CloneNotSupportedException {
        super.clone();
        Map<Entity, Entity> oldToNew = new HashMap<>();
//        // need to keep track of the entity references in fields of the entities
//        Map<String, List<Entity>> entityReferences = new HashMap<>();
//        for(Entity e: this.getEntities()){
//            for(Field f: e.getFields()){
//                if(Objects.nonNull(f.getEntityReference())){
//                    List<Entity> newList = new LinkedList<>();
//                    newList = entityReferences.putIfAbsent(e.getEntityName(), newList);
//                    newList.add(f.getEntityReference());
//                }
//            }
//        }
        List<Entity> entityList = new ArrayList<>(this.getEntities().size());
        this.getEntities().forEach(x ->
        {
            try {
                Entity newEnt = x.clone();
                oldToNew.put(x, newEnt);
                entityList.add(newEnt);
            }catch(CloneNotSupportedException e){
            }
        });

        // now fix the entity references
        for(Entity e: entityList){
//            List<Entity> validEntities = entityReferences.get(e.getEntityName());
//            if(Objects.nonNull(validEntities)) {
//                for (Field f : e.getFields()) {
//                    if (Objects.nonNull(f.getEntityReference())) {
//                        entityReferences.put(e.getEntityName(), f.getEntityReference());
//                    }
//                }
//            }
            for (Field f : e.getFields()) {
                if (Objects.nonNull(f.getEntityReference())) {
                    f.setEntityReference(oldToNew.get(f.getEntityReference()));
                }
            }
        }
        return new Module(this.getName(), entityList);
    }

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
