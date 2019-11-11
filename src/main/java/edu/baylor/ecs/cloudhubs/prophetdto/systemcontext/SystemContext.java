package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class SystemContext {

    @NonNull
    private String systemName;
    private List<Module> modules;

}
