package edu.baylor.ecs.cloudhubs.prophetdto.app;

import edu.baylor.ecs.cloudhubs.prophetdto.communication.Communication;

public class ProphetResponse {

    private Communication communication;

    private String[] contextMap;

    public ProphetResponse(){}

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    public String[] getContextMap() {
        return contextMap;
    }

    public void setContextMap(String[] contextMap) {
        this.contextMap = contextMap;
    }
}
