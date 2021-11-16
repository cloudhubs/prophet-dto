package edu.baylor.ecs.cloudhubs.prophetdto.app.utilsapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RepoReq {
    private String path;
    private boolean isMonolith;
}

