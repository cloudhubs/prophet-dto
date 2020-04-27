package edu.baylor.ecs.cloudhubs.prophetdto.app;

public class ProphetError {
  private boolean error;
  private String message;

  public ProphetError() {
  }

  public boolean isError() {
    return error;
  }

  public void setError(boolean error) {
    this.error = error;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
