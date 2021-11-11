package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Annotation {

    private String name;

    private String stringValue;
    private Integer intValue;
}
