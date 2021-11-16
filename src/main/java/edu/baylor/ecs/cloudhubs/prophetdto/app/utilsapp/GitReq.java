package edu.baylor.ecs.cloudhubs.prophetdto.app.utilsapp;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GitReq {
    private List<RepoReq> repositories;
    private String systemName;
}
