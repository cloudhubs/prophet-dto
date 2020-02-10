package edu.baylor.ecs.cloudhubs.prophetdto.app;

import java.util.List;

public class ProphetAppMultiRepoRequest {
    List<ProphetAppRequest> repositories;
    String msSystemName;

    public ProphetAppMultiRepoRequest() {
    }

    public ProphetAppMultiRepoRequest(List<ProphetAppRequest> repositories, String msSystemName) {
        this.repositories = repositories;
        this.msSystemName = msSystemName;
    }

    public List<ProphetAppRequest> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<ProphetAppRequest> repositories) {
        this.repositories = repositories;
    }

    public String getMsSystemName() {
        return msSystemName;
    }

    public void setMsSystemName(String msSystemName) {
        this.msSystemName = msSystemName;
    }
}
