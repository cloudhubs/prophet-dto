package edu.baylor.ecs.cloudhubs.prophetdto.app;

public class ProphetAppGlobal {
    String projectName;

    /**
     * True if we failed to make a communication diagram for this project, else false
     */
    boolean noCommunication;

    /**
     * Mermaid communication diagram
     */
    String communication;

    /**
     * True if we failed to make a context map for this project, else false
     */
    boolean noContextMap;

    /**
     * Mermaid context map
     */
    String contextMap;

    /**
     * True if we failed to clone this repo, else false
     */
    boolean cannotClone;

    public ProphetAppGlobal() {
    }

    public ProphetAppGlobal(String projectName, String communication, String contextMap) {
        this.projectName = projectName;
        this.communication = communication;
        this.contextMap = contextMap;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public boolean isNoCommunication() {
        return noCommunication;
    }

    public void setNoCommunication(boolean noCommunication) {
        this.noCommunication = noCommunication;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public boolean isNoContextMap() {
        return noContextMap;
    }

    public void setNoContextMap(boolean noContextMap) {
        this.noContextMap = noContextMap;
    }

    public String getContextMap() {
        return contextMap;
    }

    public void setContextMap(String contextMap) {
        this.contextMap = contextMap;
    }

    public boolean isCannotClone() {
        return cannotClone;
    }

    public void setCannotClone(boolean cannotClone) {
        this.cannotClone = cannotClone;
    }
}
