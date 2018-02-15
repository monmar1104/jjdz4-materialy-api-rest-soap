package com.infoshareacademy.api.states;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

public class StateServiceTest {

    private StateService stateService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

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

    @Test
    public void shouldHandleFailure() {
        expectedException.expect(NullPointerException.class);
//        expectedException.expectMessage();
        stateService.getStateNameByAbbr("WAA");
    }

}
