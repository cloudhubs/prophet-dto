package edu.baylor.ecs.cloudhubs.prophetdto.app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProphetError {
  private boolean error;
  private String errorMessage;
}
