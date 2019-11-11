package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Annotation {

    @NonNull
    private String name;

    private String stringValue = null;
    private Integer intValue = 0;
}
