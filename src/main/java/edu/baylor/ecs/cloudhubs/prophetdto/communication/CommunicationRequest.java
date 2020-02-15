package edu.baylor.ecs.cloudhubs.prophetdto.communication;

import lombok.Data;

import java.util.List;

@Data
public class CommunicationRequest {

    public List<String> microservices;
}