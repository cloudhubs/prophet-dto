package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class SystemContext {

    private String systemName;

    private Set<Module> modules;
}
