package edu.baylor.ecs.cloudhubs.prophetdto.app.utilsapp;

import java.util.List;

public class GitReq {
    private List<RepoReq> repositories;
    private String systemName;
    public GitReq() {}
    public List<RepoReq> getRepositories() {
        return repositories;
    }
    public void setRepositories(List<RepoReq> repositories) {
        this.repositories = repositories;
    }
    public String getSystemName() {
        return systemName;
    }
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
}
