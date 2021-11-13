package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SystemContext {

    private String systemName;

    private Set<Module> modules;
}
