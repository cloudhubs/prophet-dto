package edu.baylor.ecs.cloudhubs.prophetdto.mermaid;

import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.Entity;
import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.Field;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MermaidGraph {

    private List<MermaidNode> nodes;

    private List<MermaidEdge> edges;

    private Set<Entity> entities;

    public MermaidGraph(){}

    public MermaidGraph(List<MermaidNode> nodes, List<MermaidEdge> edges, Set<Entity> entities) {
        this.nodes = nodes;
        this.edges = edges;
        this.entities = entities;
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

    public Set<Entity> getEntities() {
        return entities;
    }

    public void setEntities(Set<Entity> entities) {
        this.entities = entities;
    }


//    Class01 <|-- AveryLongClass : Cool
//    Class03 *-- Class04
//    Class05 o-- Class06
//    Class07 .. Class08
//    Class09 --> C2 : Where am i?
//    Class09 --* C3
//    Class09 --|> Class07
//    Class07 : equals()
//    Class07 : Object[] elementData
//    Class01 : size()
//    Class01 : int chimp
//    Class01 : int gorilla
//    Class08 <--> C2: Cool label


//    classDiagram
//    class BankAccount
//            BankAccount : +String owner
//    BankAccount : +Bigdecimal balance
//    class ATM
//            ATM : Place
//    BankAccount --> ATM

    public List<String> getHtmlLines(){
        List<String> list = new ArrayList<>();
        list.add("classDiagram");
        for (Entity e: entities
        ) {
            list.add("\t class " + e.getEntityName());
            for (Field f: e.getFields()){
                if (!f.isReference()){
                    list.add("      " + e.getEntityName().getName() + " : +" + f.getType() + " " + f.getName().getName());
                }
            }
        }
        for (MermaidEdge me: edges
             ) {
            list.add(me.getFrom() + " --> " + me.getTo() + " : 1:N");
        }

        return list;
    }
}
