package edu.baylor.ecs.cloudhubs.prophetdto.app;

import edu.baylor.ecs.cloudhubs.prophetdto.communication.Communication;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProphetResponse {

    private Communication communication;

    private String[] contextMap;
}
