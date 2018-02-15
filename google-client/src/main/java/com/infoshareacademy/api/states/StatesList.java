package com.infoshareacademy.api.states;

import org.codehaus.jackson.annotate.JsonProperty;

public class StatesList {
    public StateResponseList getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(StateResponseList restResponse) {
        this.restResponse = restResponse;
    }

    @JsonProperty("RestResponse")
    private StateResponseList restResponse;


}
