package edu.baylor.ecs.cloudhubs.prophetdto.app;

public class MicroserviceResult {
    private String name;
    private String boundedContext;
    private boolean hasBoundedContext;

    public MicroserviceResult() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoundedContext() {
        return boundedContext;
    }

    public void setBoundedContext(String boundedContext) {
        this.boundedContext = boundedContext;
    }

    public boolean isHasBoundedContext() {
        return hasBoundedContext;
    }

    public void setHasBoundedContext(boolean hasBoundedContext) {
        this.hasBoundedContext = hasBoundedContext;
    }
}
