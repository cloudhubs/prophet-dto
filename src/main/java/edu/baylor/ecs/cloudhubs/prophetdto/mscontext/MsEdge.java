package edu.baylor.ecs.cloudhubs.prophetdto.mscontext;

import lombok.Data;

@Data
public class MsEdge {
    private Integer from;
    private Integer to;
    private Integer width = 1;
    private Integer length = 200;
    private MsLabel label;

    @Override
    public String toString() {
        return String.format("{ from: %d, to: %d, width: %d, length: %d, label: %s }", from, to, width, length, label);
    }
}
