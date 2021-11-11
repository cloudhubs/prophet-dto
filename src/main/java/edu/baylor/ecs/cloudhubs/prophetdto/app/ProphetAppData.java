package edu.baylor.ecs.cloudhubs.prophetdto.app;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProphetAppData {
    private ProphetAppGlobal global;
    private List<MicroserviceResult> ms;
}
