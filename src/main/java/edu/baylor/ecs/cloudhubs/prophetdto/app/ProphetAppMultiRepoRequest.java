package edu.baylor.ecs.cloudhubs.prophetdto.app;

import java.util.List;

public class ProphetAppMultiRepoRequest {
    private List<String> paths;
    private boolean cached;
    private boolean persistDb;
    private boolean isMonolith;
    private boolean all;
    private boolean communication;

    public ProphetAppMultiRepoRequest() {}

    public ProphetAppMultiRepoRequest(List<String> paths, boolean cached, boolean persistDb, boolean isMonolith, boolean all, boolean communication) {
        this.paths = paths;
        this.cached = cached;
        this.persistDb = persistDb;
        this.isMonolith = isMonolith;
        this.all = all;
        this.communication = communication;
    }

    public List<String> getPaths() { return paths; }
    public void setPaths(List<String> paths) { this.paths = paths; }
    public boolean isCached() { return cached; }
    public void setCached(boolean cached) { this.cached = cached; }
    public boolean isPersistDb() { return persistDb; }
    public void setPersistDb(boolean persistDb) { this.persistDb = persistDb; }
    public boolean isMonolith() { return isMonolith; }
    public void setMonolith(boolean monolith) { isMonolith = monolith; }
    public boolean isAll() { return all; }
    public void setAll(boolean all) { this.all = all; }
    public boolean isCommunication() { return communication; }
    public void setCommunication(boolean communication) { this.communication = communication; }
}
