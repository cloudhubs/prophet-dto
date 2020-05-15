package edu.baylor.ecs.cloudhubs.prophetdto.app;

public class MicroserviceResult {
    private String name;

    /**
     * True if we failed to created bounded context, else false
     */
    private boolean noBoundedContext;

    /**
     * True if we failed to find Java files in the project, else false
     */
    private boolean notJava;

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

    public boolean isNoBoundedContext() {
        return noBoundedContext;
    }

    public void setNoBoundedContext(boolean noBoundedContext) {
        this.noBoundedContext = noBoundedContext;
    }

    public boolean isNotJava() {
        return notJava;
    }

    public void setNotJava(boolean notJava) {
        this.notJava = notJava;
    }
}
