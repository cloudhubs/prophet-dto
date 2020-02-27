package edu.baylor.ecs.cloudhubs.prophetdto.communication;

import java.util.Set;

public class Communication {

    private Set<Node> nodes;

    private Set<Edge> edges;

    public Communication() {
    }

    public Communication(Set<Node> nodes, Set<Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public Set<Edge> getEdges() {
        return edges;
    }

    public void setEdges(Set<Edge> edges) {
        this.edges = edges;
    }
}
