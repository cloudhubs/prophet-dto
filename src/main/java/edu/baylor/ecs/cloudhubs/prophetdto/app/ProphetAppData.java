package edu.baylor.ecs.cloudhubs.prophetdto.app;

import java.util.List;

public class ProphetAppData {

    private ProphetAppGlobal global;
    private List<MicroserviceResult> ms;

    public ProphetAppData() {}

    public ProphetAppGlobal getGlobal() {
        return global;
    }

    public void setGlobal(ProphetAppGlobal global) {
        this.global = global;
    }

    public List<MicroserviceResult> getMs() { return ms; }
    public void setMs(List<MicroserviceResult> ms) { this.ms = ms; }
}
