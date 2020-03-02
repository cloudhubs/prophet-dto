package edu.baylor.ecs.cloudhubs.prophetdto.communication;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Node {

    private String id;
    private String label;

    public Node(String label) {
        this.label = label;
    }
}
