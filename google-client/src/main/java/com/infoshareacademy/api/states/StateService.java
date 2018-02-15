package com.infoshareacademy.api.states;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.List;

public class StateService {

    public String getStateNameByAbbr(String abbr) {
        String address = "http://services.groupkt.com/state/get/USA/"+abbr.toUpperCase();
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(address);
        Response response = webTarget.request().get();

        States states = response.readEntity(States.class);
        return states.getRestResponse().getResult().getName();
    }

    public List<StateDetails> getAllStates() {
        String address = "http://services.groupkt.com/state/get/USA/all";
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(address);
        Response response = webTarget.request().get();
        StatesList states = response.readEntity(StatesList.class);

        return states.getRestResponse().getResult();
    }
}
