package edu.baylor.ecs.cloudhubs.prophetdto.app.boundedcontext;

import edu.baylor.ecs.cloudhubs.prophetdto.systemcontext.SystemContext;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
public class BoundedContextRequest {
	@NonNull
	private SystemContext context;

	@Accessors(fluent = true)
	private boolean useWuPalmer = false;
}
