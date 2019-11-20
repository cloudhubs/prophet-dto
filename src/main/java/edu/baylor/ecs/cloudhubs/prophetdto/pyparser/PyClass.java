package edu.baylor.ecs.cloudhubs.prophetdto.pyparser;

import lombok.Data;

import java.util.List;

@Data
public class PyClass {
    String name;
    String type;
    String component_type;
    List<PyImport> imports;
    List<PyBase> bases;
    List<PyClass> classes;
    List<PyFunction> functions;
}
