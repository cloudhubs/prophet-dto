package edu.baylor.ecs.cloudhubs.prophetdto.mscontext;

import lombok.Data;

@Data
public class MsNode {
    private Integer id;
    private String label;
    private String shape = "box";

    @Override
    public String toString() {
        return String.format("{ id: %d, label: %s, shape: %s }", id, label, shape);
    }
}
