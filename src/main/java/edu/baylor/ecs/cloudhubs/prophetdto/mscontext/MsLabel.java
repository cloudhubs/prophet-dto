package edu.baylor.ecs.cloudhubs.prophetdto.mscontext;

import lombok.Data;

@Data
public class MsLabel {
    private MsLabelType type;
    private String argument;
    private String msReturn;
    private String endpointFunction;

    @Override
    public String toString() {
        return String.format("argument: %s, return: %s, type: %s, endpoint function: %s", argument, msReturn, type, endpointFunction);
    }
}
