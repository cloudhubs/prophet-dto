package edu.baylor.ecs.cloudhubs.prophetdto.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents an identification of a place in the code
 * This place in the code has inconsistent String value
 * with some other place. The other place is the other item
 * in the InconsistencyTuple array.
 */
@AllArgsConstructor
@Getter
@Setter
public class InconsistencyItem {
    // Path to a file with code
    private String filePath;
    // Line number in the file
    private Integer line;
    // inconsistent value
    private String value;
}
