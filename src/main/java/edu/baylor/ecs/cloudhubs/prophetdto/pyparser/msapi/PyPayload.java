package edu.baylor.ecs.cloudhubs.prophetdto.pyparser.msapi;

import lombok.Data;

import java.util.List;

@Data
public class PyPayload {
    String type;
    String name;
    List<String> props;
}
