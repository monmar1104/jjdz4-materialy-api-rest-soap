package com.infoshareacademy.api.states;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StateServiceTest {

    private StateService stateService;
    @Before
    public void setUp(){
         stateService = new StateService();
    }
    @Test
    public void shouldPrintStateName(){
        final String stateAbbr = "WA";
        String stateName = stateService.getStateNameByAbbr(stateAbbr);
        assertThat(stateName,is("Washington"));
    }

    @Test
    public void shouldGetNumberOfStates(){
        List<StateDetails> stateDetailsList = stateService.getAllStates();
        int numberOfState = stateDetailsList.size();
        assertThat(numberOfState,is(55));
    }

}
