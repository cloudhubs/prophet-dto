package edu.baylor.ecs.cloudhubs.prophetdto.app;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class ProphetRequest {

    String url;

    @Override
    public String toString() {
        return "ProphetRequest{" +
                "url='" + url + '\'' +
                '}';
    }
}
