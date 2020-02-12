package edu.baylor.ecs.cloudhubs.prophetdto.app;

public class ProphetAppRequest {
    /*
    {
        "path": "/tmp/tms",
        "cached": false,
        "persistDb": true,
        "isMonolith": false //if it consists from subfolders with mss like tms
        "all": true //if to analyze all or some subset
        "communication": true
        "contextmap": true //more fields to be added later
    }
     */

    private String path;
    private boolean cached;
    private boolean persistDb;
    private boolean isMonolith;
    private boolean all;
    private boolean communication;

    public ProphetAppRequest() {}

    public ProphetAppRequest(String path, boolean cached, boolean persistDb, boolean isMonolith, boolean all, boolean communication) {
        this.path = path;
        this.cached = cached;
        this.persistDb = persistDb;
        this.isMonolith = isMonolith;
        this.all = all;
        this.communication = communication;
    }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }
    public boolean isCached() { return cached; }
    public void setCached(boolean cached) { this.cached = cached; }
    public boolean isPersistDb() { return persistDb; }
    public void setPersistDb(boolean persistDb) { this.persistDb = persistDb; }
    public boolean isMonolith() { return isMonolith; }
    public void setIsMonolith(boolean monolith) { isMonolith = monolith; }
    public boolean isAll() { return all; }
    public void setAll(boolean all) { this.all = all; }
    public boolean isCommunication() { return communication; }
    public void setCommunication(boolean communication) { this.communication = communication; }
}
