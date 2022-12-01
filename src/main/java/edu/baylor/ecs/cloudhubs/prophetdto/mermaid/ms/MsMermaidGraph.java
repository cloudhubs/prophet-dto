package edu.baylor.ecs.cloudhubs.prophetdto.mermaid.ms;

import edu.baylor.ecs.cloudhubs.prophetdto.mermaid.MermaidEdge;
import edu.baylor.ecs.cloudhubs.prophetdto.mermaid.MermaidNode;
import edu.baylor.ecs.cloudhubs.prophetdto.mscontext.MsModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
        if (edges.size() == 0) {
            lines.add("N/A");
        }
        // from -->|text| to
        for (MermaidEdge edge : edges) {
            lines.add(edge.getFrom() + "-->|\"" + edge.getText() + "\"|" + edge.getTo());
        }
        return lines;
    }
    
    public String getJSONRepresentation() {
    	Map<String, Map<String, Map<String, Map<String, List<ServiceData>>>>> mapRepresentation = getMapRepresentation();
    	ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(mapRepresentation);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Map<String, Map<String, Map<String, Map<String, List<ServiceData>>>>> getMapRepresentation() {
    	Map<String, Map<String, Map<String, Map<String, List<ServiceData>>>>> mapRepresentation = new HashMap<String, Map<String,Map<String,Map<String,List<ServiceData>>>>>();
    	for (MermaidEdge edge : edges) {
    		String[] requestParts = edge.getText().split("<br/>");
    		String methodType = requestParts[0];
    		String arguments = requestParts[1];
    		String returnData = requestParts[2];
    		String endPointName = requestParts[3];
    		ServiceData serviceData = new ServiceData(arguments, returnData, endPointName);
    		
    		addToMapRepresentation(mapRepresentation, serviceData, methodType, edge.getFrom(), edge.getTo(), true);
    		addToMapRepresentation(mapRepresentation, serviceData, methodType, edge.getTo(), edge.getFrom(), false);
        }
    	
    	for (MermaidNode node : nodes) {
    		if (!mapRepresentation.containsKey(node.getName())) {
    			ServiceData serviceData = new ServiceData("", "", "");
    			String methodType = "";
    			String serviceName = node.getName();
    			addToMapRepresentation(mapRepresentation, serviceData, methodType, serviceName, "", true);
    		}
    	}
    	
    	return mapRepresentation;
    	
    }
    
    private void addToMapRepresentation(Map<String, Map<String, Map<String, Map<String, List<ServiceData>>>>> mapRepresentation, ServiceData serviceData, String methodType, String serviceName, String toBeAddedServiceName, boolean isDependant) {
    	String dependantKey = "Dependants";
    	String dependsOnKey = "DependsOn";
    	if (!mapRepresentation.containsKey(serviceName)) {
    		mapRepresentation.put(serviceName, new HashMap<String, Map<String,Map<String,List<ServiceData>>>>());
    		mapRepresentation.get(serviceName).put(dependantKey, new HashMap<String, Map<String,List<ServiceData>>>());
    		mapRepresentation.get(serviceName).put(dependsOnKey, new HashMap<String, Map<String,List<ServiceData>>>());
    	}
    	
    	if(isDependant && !mapRepresentation.get(serviceName).get(dependantKey).containsKey(methodType)) {
    		mapRepresentation.get(serviceName).get(dependantKey).put(methodType, new HashMap<String, List<ServiceData>>());
    	}
    	
    	if(!isDependant && !mapRepresentation.get(serviceName).get(dependsOnKey).containsKey(methodType)) {
    		mapRepresentation.get(serviceName).get(dependsOnKey).put(methodType, new HashMap<String, List<ServiceData>>());
    	}
    	
    	if(isDependant) {
    		
    		if(!mapRepresentation.get(serviceName).get(dependantKey).get(methodType).containsKey(toBeAddedServiceName)) {
    			mapRepresentation.get(serviceName).get(dependantKey).get(methodType).put(toBeAddedServiceName, new ArrayList<MsMermaidGraph.ServiceData>());
    		}
    		mapRepresentation.get(serviceName).get(dependantKey).get(methodType).get(toBeAddedServiceName).add(serviceData);
    		
    	} else {
    		if(!mapRepresentation.get(serviceName).get(dependsOnKey).get(methodType).containsKey(toBeAddedServiceName)) {
    			mapRepresentation.get(serviceName).get(dependsOnKey).get(methodType).put(toBeAddedServiceName, new ArrayList<MsMermaidGraph.ServiceData>());
    		}
    		mapRepresentation.get(serviceName).get(dependsOnKey).get(methodType).get(toBeAddedServiceName).add(serviceData);
    	}
    	
    }
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ServiceData {
    	private String arguments;
    	private String returnData;
    	private String endPointName;
    }
}
