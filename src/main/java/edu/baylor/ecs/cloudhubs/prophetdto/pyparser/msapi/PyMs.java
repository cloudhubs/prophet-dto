package edu.baylor.ecs.cloudhubs.prophetdto.pyparser.msapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PyMs {
    String name;
    @JsonProperty("end_points")
    List<PyPoint> apis = new ArrayList<>();
    @JsonProperty("exit_points")
    List<PyPoint> rests = new ArrayList<>();
}
