package edu.baylor.ecs.cloudhubs.prophetdto.app;

/**
 * Represents an identification of a place in the code
 * This place in the code has inconsistent String value
 * with some other place. The other place is the other item
 * in the InconsistencyTuple array.
 */
public class InconsistencyItem {
    // Path to a file with code
    private String filePath;
    // Line number in the file
    private Integer line;
    // inconsistent value
    private String value;

    public InconsistencyItem(String filePath, Integer line, String value) {
        this.filePath = filePath;
        this.line = line;
        this.value = value;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
