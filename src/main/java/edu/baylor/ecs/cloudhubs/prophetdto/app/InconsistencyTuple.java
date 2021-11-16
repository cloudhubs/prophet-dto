package edu.baylor.ecs.cloudhubs.prophetdto.app;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

/**
 * Represents a tuple of references to the code that are inconsistent
 * across the microservice system
 */
@Getter
public class InconsistencyTuple {

    private List<InconsistencyItem> items;

    public InconsistencyTuple() {
        this.items = new ArrayList<>();
    }

    public void addItem(InconsistencyItem i) {
        items.add(i);
    }
}
