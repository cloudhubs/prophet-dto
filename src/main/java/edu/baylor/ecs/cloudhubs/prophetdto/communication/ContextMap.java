package edu.baylor.ecs.cloudhubs.prophetdto.communication;

import java.util.Arrays;

public class ContextMap {

    String[] markdownStrings;

    public ContextMap(){}

    public String[] getMarkdownStrings() {
        return markdownStrings;
    }

    public void setMarkdownStrings(String[] markdownStrings) {
        this.markdownStrings = markdownStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContextMap)) return false;
        ContextMap that = (ContextMap) o;
        return Arrays.equals(getMarkdownStrings(), that.getMarkdownStrings());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getMarkdownStrings());
    }
}
