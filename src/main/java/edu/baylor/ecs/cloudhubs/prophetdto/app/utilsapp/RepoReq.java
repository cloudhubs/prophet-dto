package edu.baylor.ecs.cloudhubs.prophetdto.app.utilsapp;

public class RepoReq {
    private String path;
    private boolean isMonolith;
    private boolean isLocal;
    public RepoReq() {}
    public String getPath() {return path; }
    public void setPath(String path) { this.path = path; }
    public boolean isMonolith() { return isMonolith; }
    public void setMonolith(boolean monolith) { isMonolith = monolith; }
    public boolean isLocal() { return isLocal; }
    public void setLocal(boolean local) { isLocal = local; }
}

