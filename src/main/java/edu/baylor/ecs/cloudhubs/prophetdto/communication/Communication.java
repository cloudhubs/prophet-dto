package edu.baylor.ecs.cloudhubs.prophetdto.communication;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Communication {

    private Set<Node> nodes;

    private Set<Edge> edges;
}
