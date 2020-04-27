package edu.baylor.ecs.cloudhubs.prophetdto.communication;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Edge {

    private String label;

    private String sequenceNumber;

    private String conditionString;

    private String idA;

    private String idB;

}
