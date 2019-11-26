package edu.baylor.ecs.cloudhubs.prophetdto.mscontext;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MsNode {
    private Integer id;
    private String label;
    private String shape = "box";

    public MsNode(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return String.format("{ id: %d, label: %s, shape: %s }", id, label, shape);
    }
}
