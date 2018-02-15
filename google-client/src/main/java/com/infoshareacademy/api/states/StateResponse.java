package com.infoshareacademy.api.states;

import java.util.List;

public class StateResponse {
    private List<String> messages;
    private StateDetails result;


    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public StateDetails getResult() {
        return result;
    }

    public void setResult(StateDetails result) {
        this.result = result;
    }
}
