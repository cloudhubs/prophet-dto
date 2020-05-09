package edu.baylor.ecs.cloudhubs.prophetdto.app;

public class MicroserviceResult {
    private String name;

    /**
     * True if we could make a bounded context for this service, else false
     */
    private boolean hasBoundedContext;

    /**
     * Message giving the reason we failed to create a bounded context
     */
    private String message;

    /**
     * Mermaid class diagram for bounded context
     */
    private String boundedContext;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
