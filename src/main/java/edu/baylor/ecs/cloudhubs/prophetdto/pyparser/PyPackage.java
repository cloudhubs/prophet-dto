package edu.baylor.ecs.cloudhubs.prophetdto.pyparser;

import lombok.Data;

import java.util.List;

@Data
public class PyPackage {
    String name;
    String type;
    List<PyModule> modules;
    List<PyPackage> packages;
}
