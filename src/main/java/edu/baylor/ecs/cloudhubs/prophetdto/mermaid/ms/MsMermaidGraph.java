package edu.baylor.ecs.cloudhubs.prophetdto.mermaid.ms;

import edu.baylor.ecs.cloudhubs.prophetdto.mermaid.MermaidEdge;
import edu.baylor.ecs.cloudhubs.prophetdto.mermaid.MermaidNode;
import edu.baylor.ecs.cloudhubs.prophetdto.mscontext.MsModel;

import java.util.List;

public class MsMermaidGraph {
    private List<MermaidNode> nodes;
    private List<MermaidEdge> edges;
    private MsModel model;

    public MsMermaidGraph() {
    }

    public MsMermaidGraph(List<MermaidNode> nodes, List<MermaidEdge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<MermaidNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<MermaidNode> nodes) {
        this.nodes = nodes;
    }

    public List<MermaidEdge> getEdges() {
        return edges;
    }

    public void setEdges(List<MermaidEdge> edges) {
        this.edges = edges;
    }

    public MsModel getModel() {
        return model;
    }

    public void setModel(MsModel model) {
        this.model = model;
    }
}
