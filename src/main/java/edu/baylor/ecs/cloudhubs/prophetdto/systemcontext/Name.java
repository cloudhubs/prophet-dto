package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Name {

    private String name;
    private String fullName;

    public Name(Name n){
        this.name = n.name;
        this.fullName = n.fullName;
    }

    public Name(String str){
        this.name = str;
        this.fullName = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    //TODO fix this and equals
    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}
