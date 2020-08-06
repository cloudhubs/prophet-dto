package edu.baylor.ecs.cloudhubs.prophetdto.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a tuple of references to the code that are inconsistent
 * across the microservice system
 */
public class InconsistencyTuple {

    private List<InconsistencyItem> items;

    public InconsistencyTuple() {
        this.items = new ArrayList<>();
    }

    public List<InconsistencyItem> getItems() {
        return items;
    }

    public void addItem(InconsistencyItem i) {
        items.add(i);
    }
}
