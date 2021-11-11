package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import java.util.*;

import lombok.Data;

@Data
public class Module {

    private Name name;

    private Set<Entity> entities;

    public Module clone(){
        Set<Entity> entitySet = new HashSet<>();
        this.getEntities().forEach(x ->
        {
            entitySet.add(x.clone());
        });

        return new Module(this.getName(), entitySet);
    }
    public Module(){}

    public Module(String name) {
        this.name = new Name(name);
        this.entities = new HashSet<>();
    }

    public Module( Name name, Set<Entity> entities) {
        this.name = new Name(name);
        this.entities = entities;
    }
}
