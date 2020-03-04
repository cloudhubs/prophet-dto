package edu.baylor.ecs.cloudhubs.prophetdto.app.utilsapp;

public class RepoReq {
    private String localPath;
    private boolean isMonolith;
    private String organization;
    private String repository;
    public RepoReq() {}
    public String getLocalPath() {return localPath; }
    public void setLocalPath(String localPath) { this.localPath = localPath; }
    public boolean isMonolith() { return isMonolith; }
    public void setMonolith(boolean monolith) { isMonolith = monolith; }
    public String getOrganization() { return organization; }
    public void setOrganization(String organization) { this.organization = organization; }
    public String getRepository() { return repository; }
    public void setRepository(String repository) { this.repository = repository; }
}

