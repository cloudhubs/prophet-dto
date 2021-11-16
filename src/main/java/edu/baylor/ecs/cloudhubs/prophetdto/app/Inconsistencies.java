package edu.baylor.ecs.cloudhubs.prophetdto.app;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

/**
 * Represents inconsistency categories
 */
@Getter
public class Inconsistencies {

    private List<InconsistencyTuple> security;
    private List<InconsistencyTuple> database;
    private List<InconsistencyTuple> api;

    public Inconsistencies(){
        this.security = new ArrayList<>();
        this.database = new ArrayList<>();
        this.api = new ArrayList<>();
    }

    public void addSecurity(InconsistencyTuple t){
        this.security.add(t);
    }

    public void addDatabase(InconsistencyTuple t){
        this.database.add(t);
    }

    public void addApi(InconsistencyTuple t){
        this.api.add(t);
    }
}
