package edu.baylor.ecs.cloudhubs.prophetdto.mermaid.ms;

import edu.baylor.ecs.cloudhubs.prophetdto.mermaid.MermaidEdge;
import edu.baylor.ecs.cloudhubs.prophetdto.mermaid.MermaidNode;
import edu.baylor.ecs.cloudhubs.prophetdto.mscontext.MsModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a mermaid graph of a microservice REST communication graph obtained from RAD
 * TODO: Perhaps MermaidGraph should be broken out into a super class, with this and EntityMermaidGraph as subclasses
 */
public class MsMermaidGraph {
    private List<MermaidNode> nodes;
    private List<MermaidEdge> edges;
    private MsModel model;

    public MsMermaidGraph() {
    }

    public MsMermaidGraph(List<MermaidNode> nodes, List<MermaidEdge> edges, MsModel model) {
        this.nodes = nodes;
        this.edges = edges;
        this.model = model;
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

    public List<String> getHtmlLines() {
        List<String> lines = new ArrayList<>();
        lines.add("graph TD");
        for (MermaidNode node : nodes) {
            lines.add(node.getName());
        }
        // from -->|text| to
        for (MermaidEdge edge : edges) {
            lines.add(edge.getFrom() + "-->|\"" + edge.getText() + "\"|" + edge.getTo());
        }
        return lines;
    }
}
