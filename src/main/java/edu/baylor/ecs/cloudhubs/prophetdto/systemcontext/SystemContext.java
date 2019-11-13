package edu.baylor.ecs.cloudhubs.prophetdto.systemcontext;

import lombok.*;

import java.util.List;
import java.util.Objects;

public class SystemContext {

    @NonNull
    private String systemName;

    private List<Module> modules;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public SystemContext(@NonNull String systemName, List<Module> modules) {
        this.systemName = systemName;
        this.modules = modules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemContext that = (SystemContext) o;
        return Objects.equals(systemName, that.systemName) &&
                Objects.equals(modules, that.modules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemName, modules);
    }
}
