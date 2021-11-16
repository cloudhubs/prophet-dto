package edu.baylor.ecs.cloudhubs.prophetdto.mermaid;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MermaidEdge {

    private String from;

    private String to;

    private String text;

    private boolean isBidirectional = false;

    private String fromCardinality;

    private String toCardinality;

    public MermaidEdge(){}

    public MermaidEdge(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public MermaidEdge(String from, String to, String text) {
        this.from = from;
        this.to = to;
        this.text = text;
    }

    public MermaidEdge(String from, String to, String text, boolean isBidirectional, String fromCardinality, String toCardinality) {
        this.from = from;
        this.to = to;
        this.text = text;
        this.isBidirectional = isBidirectional;
        this.fromCardinality = fromCardinality;
        this.toCardinality = toCardinality;
    }

    public boolean exists(String from, String to){
        if (from.equals(this.from) && to.equals(this.to)){
            return true;
        }

        if (from.equals(this.to) && to.equals(this.from)){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "MermaidEdge{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
