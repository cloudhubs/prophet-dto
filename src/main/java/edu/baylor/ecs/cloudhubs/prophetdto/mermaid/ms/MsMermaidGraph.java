package edu.baylor.ecs.cloudhubs.prophetdto.mermaid.ms;

import edu.baylor.ecs.cloudhubs.prophetdto.mermaid.MermaidEdge;
import edu.baylor.ecs.cloudhubs.prophetdto.mermaid.MermaidNode;
import edu.baylor.ecs.cloudhubs.prophetdto.mscontext.MsModel;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Represents a mermaid graph of a microservice REST communication graph obtained from RAD
 * TODO: Perhaps MermaidGraph should be broken out into a super class, with this and EntityMermaidGraph as subclasses
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MsMermaidGraph {
    private List<MermaidNode> nodes;
    private List<MermaidEdge> edges;
    private MsModel model;

    public List<String> getHtmlLines() {
        List<String> lines = new ArrayList<>();
        lines.add("graph TD");
        if (edges.size() == 0) {
            lines.add("N/A");
        }
        // from -->|text| to
        for (MermaidEdge edge : edges) {
            lines.add(edge.getFrom() + "-->|\"" + edge.getText() + "\"|" + edge.getTo());
        }
        return lines;
    }
}
