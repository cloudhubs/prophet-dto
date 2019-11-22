package edu.baylor.ecs.cloudhubs.prophetdto.mscontext;

import lombok.Data;

@Data
public class MsLabel {
    private MsLabelType type;
    private String argument;
    private String msReturn;

    @Override
    public String toString() {
        return String.format("argument: %s, return: %s, type: %s", argument, msReturn, type);
    }
}
