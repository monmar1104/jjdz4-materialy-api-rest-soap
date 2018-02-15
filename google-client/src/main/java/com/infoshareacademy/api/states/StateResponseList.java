package com.infoshareacademy.api.states;

import java.util.List;

public class StateResponseList {
    private List<String> messages;
    private List<StateDetails> result;

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<StateDetails> getResult() {
        return result;
    }

    public void setResult(List<StateDetails> result) {
        this.result = result;
    }
}
