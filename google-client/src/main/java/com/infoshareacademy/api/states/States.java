package com.infoshareacademy.api.states;

import org.codehaus.jackson.annotate.JsonProperty;

public class States {
    @JsonProperty("RestResponse")
    private StateResponse restResponse;

    public StateResponse getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(StateResponse restResponse) {
        this.restResponse = restResponse;
    }
}
