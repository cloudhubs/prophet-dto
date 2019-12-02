package edu.baylor.ecs.cloudhubs.prophetdto.pyparser.msapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PyMsSystem {
    String name;
    @JsonProperty("interfaces")
    List<PyMs> microservices = new ArrayList<>();
}
