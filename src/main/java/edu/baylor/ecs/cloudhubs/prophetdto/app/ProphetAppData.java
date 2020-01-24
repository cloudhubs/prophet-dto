package edu.baylor.ecs.cloudhubs.prophetdto.app;

import edu.baylor.ecs.cloudhubs.prophetdto.communication.ContextMap;

import java.util.List;

public class ProphetAppData {
    private String projectName;
    private ContextMap communication;
    private ContextMap contextMap;
    private List<MicroserviceResult> microservices;

    public ProphetAppData() {}

    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }
    public ContextMap getCommunication() { return communication; }
    public void setCommunication(ContextMap communication) { this.communication = communication; }
    public ContextMap getContextMap() { return contextMap; }
    public void setContextMap(ContextMap contextMap) { this.contextMap = contextMap; }
    public List<MicroserviceResult> getMicroservices() { return microservices; }
    public void setMicroservices(List<MicroserviceResult> microservices) { this.microservices = microservices; }
}
