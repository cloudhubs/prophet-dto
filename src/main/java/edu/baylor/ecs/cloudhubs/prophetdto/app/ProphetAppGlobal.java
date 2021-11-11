package edu.baylor.ecs.cloudhubs.prophetdto.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProphetAppGlobal {
    String projectName;

    /**
     * True if we failed to make a communication diagram for this project, else false
     */
    boolean noCommunication;

    /**
     * Mermaid communication diagram
     */
    String communication;

    /**
     * True if we failed to make a context map for this project, else false
     */
    boolean noContextMap;

    /**
     * Mermaid context map
     */
    String contextMap;

    /**
     * True if we failed to clone this repo, else false
     */
    boolean cannotClone;
}
