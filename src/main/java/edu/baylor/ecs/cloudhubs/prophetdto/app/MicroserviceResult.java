package edu.baylor.ecs.cloudhubs.prophetdto.app;

import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.BoundedContext;

public class MicroserviceResult {
    private String name;
    private BoundedContext boundedContext;

    public MicroserviceResult() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BoundedContext getBoundedContext() {
        return boundedContext;
    }

    public void setBoundedContext(BoundedContext boundedContext) {
        this.boundedContext = boundedContext;
    }
}
