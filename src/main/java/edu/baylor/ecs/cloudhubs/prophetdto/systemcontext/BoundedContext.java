package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoundedContext {

    private String systemName;

    private Set<Entity> boundedContextEntities;
}
