package edu.baylor.ecs.cloudhubs.prophetdto.app;

public class ProphetServiceError {
  private String errorSource;
  private String errorMessage;

  public ProphetServiceError() {}

  public ProphetServiceError(String errorSource, String errorMessage) {
    this.errorSource = errorSource;
    this.errorMessage = errorMessage;
  }

  public String getErrorSource() {
    return errorSource;
  }

  public void setErrorSource(String errorSource) {
    this.errorSource = errorSource;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
