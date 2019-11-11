package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class BoundedContext {
    private String systemName;
    private List<Entity> boundedContextEntities;

    public BoundedContext(String systemName, List<Entity> boundedContextEntities) {
        this.systemName = systemName;
        this.boundedContextEntities = boundedContextEntities;
    }
}
