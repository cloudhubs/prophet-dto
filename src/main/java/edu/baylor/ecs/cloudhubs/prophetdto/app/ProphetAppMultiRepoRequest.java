package edu.baylor.ecs.cloudhubs.prophetdto.app;

import java.util.List;

public class ProphetAppMultiRepoRequest {
    List<ProphetAppRequest> repositories;
    String systemName;

    public ProphetAppMultiRepoRequest() {
    }

    public ProphetAppMultiRepoRequest(List<ProphetAppRequest> repositories, String systemName) {
        this.repositories = repositories;
        this.systemName = systemName;
    }

    public List<ProphetAppRequest> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<ProphetAppRequest> repositories) {
        this.repositories = repositories;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
}
