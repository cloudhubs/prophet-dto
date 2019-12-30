package edu.baylor.ecs.cloudhubs.prophetdto.app;

import java.util.Objects;

public class ProphetRequest {

    String url;

    public ProphetRequest(){}

    public ProphetRequest(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProphetRequest)) return false;
        ProphetRequest that = (ProphetRequest) o;
        return Objects.equals(getUrl(), that.getUrl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUrl());
    }

    @Override
    public String toString() {
        return "ProphetRequest{" +
                "url='" + url + '\'' +
                '}';
    }
}
