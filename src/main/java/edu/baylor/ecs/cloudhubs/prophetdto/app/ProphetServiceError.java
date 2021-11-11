package edu.baylor.ecs.cloudhubs.prophetdto.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProphetServiceError {
  private String errorSource;
  private String errorMessage;
}
