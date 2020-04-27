package edu.baylor.ecs.cloudhubs.prophetdto.app.utilsapp;

public class RepoReq {
    private String path;
    private boolean isMonolith;
    public RepoReq() {}
    public String getPath() {return path; }
    public void setPath(String path) { this.path = path; }
    public boolean isMonolith() { return isMonolith; }
    public void setMonolith(boolean monolith) { isMonolith = monolith; }
}

