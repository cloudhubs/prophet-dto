package edu.baylor.ecs.cloudhubs.prophetdto.mermaid;

import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.Entity;
import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.Field;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MermaidGraph {

    private List<MermaidNode> nodes;

    private List<MermaidEdge> edges;

    private Set<Entity> entities;


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
        for (MermaidEdge me: edges) {
            String arrow;
            if (me.isBidirectional()) {
                arrow = " -- ";
            } else {
                arrow = " --> ";
            }
            list.add(me.getFrom() + " \"" + me.getFromCardinality() + "\"" +
                    arrow +
                    "\"" + me.getToCardinality() + "\" " + me.getTo());
        }
        for (Entity e: entities) {
            list.add("\t class " + e.getEntityName().getName());
            for (Field f: e.getFields()){
                if (!f.isReference()){
                    list.add("      " + e.getEntityName().getName() + " : +" + f.getType() + " " + f.getName().getName());
                }
            }
        }
        return list;
    }
}
