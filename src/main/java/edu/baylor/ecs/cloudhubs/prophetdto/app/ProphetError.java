package edu.baylor.ecs.cloudhubs.prophetdto.app;

public class ProphetError {
  private boolean error;
  private String errorMessage;

  public ProphetError() {
  }

  public boolean isError() {
    return error;
  }

  public void setError(boolean error) {
    this.error = error;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
