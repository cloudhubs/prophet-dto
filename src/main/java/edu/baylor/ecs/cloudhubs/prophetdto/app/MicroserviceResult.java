package edu.baylor.ecs.cloudhubs.prophetdto.app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MicroserviceResult {
    private String name;

    /**
     * True if we failed to created bounded context, else false
     */
    private boolean noBoundedContext;

    /**
     * True if we failed to find Java files in the project, else false
     */
    private boolean notJava;

    /**
     * Mermaid class diagram for bounded context
     */
    private String boundedContext;
}
