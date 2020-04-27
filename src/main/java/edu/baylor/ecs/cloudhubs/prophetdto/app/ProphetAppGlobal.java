package edu.baylor.ecs.cloudhubs.prophetdto.app;

public class ProphetAppGlobal {
    String projectName;
    boolean hasCommunication;
    String communication;
    boolean hasContextMap;
    String contextMap;

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

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public String getContextMap() {
        return contextMap;
    }

    public void setContextMap(String contextMap) {
        this.contextMap = contextMap;
    }

    public boolean getHasCommunication() {
        return hasCommunication;
    }

    public void setHasCommunication(boolean hasCommunication) {
        this.hasCommunication = hasCommunication;
    }

    public boolean getHasContextMap() {
        return hasContextMap;
    }

    public void setHasContextMap(boolean hasContextMap) {
        this.hasContextMap = hasContextMap;
    }
}
