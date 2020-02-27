package edu.baylor.ecs.cloudhubs.prophetdto.communication;

import lombok.Data;

@Data
public class Node {

    private String id;
    private String label;

    public Node(String label) {
        this.label = label;
    }
}
