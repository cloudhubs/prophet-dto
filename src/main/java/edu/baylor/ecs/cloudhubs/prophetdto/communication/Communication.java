package edu.baylor.ecs.cloudhubs.prophetdto.communication;

public class Communication {

    private Edge[] edges;

    private Node[] nodes;

    public Communication() {
    }

    public Edge[] getEdges() {
        return edges;
    }

    public void setEdges(Edge[] edges) {
        this.edges = edges;
    }

    public Node[] getNodes() {
        return nodes;
    }

    public void setNodes(Node[] nodes) {
        this.nodes = nodes;
    }
}
