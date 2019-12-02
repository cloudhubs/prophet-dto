package edu.baylor.ecs.cloudhubs.prophetdto.pyparser.msapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PyPoint {
    String name;
    @JsonProperty("func_name")
    String functionName;
    String path;
    @JsonProperty("file_name")
    String fileName;
    @JsonProperty("line_no")
    Integer lineNumber;
    PyPayload response;
    List<PyPayload> payload;
    List<Object> decorators = new ArrayList<>();
}
