package com.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseData<T> {
    private boolean status;
    private List<String> message = new ArrayList<>();
    private T payload;


    /**
     * @return boolean return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return List<String> return the message
     */
    public List<String> getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(List<String> message) {
        this.message = message;
    }

    /**
     * @return T return the payload
     */
    public T getPayload() {
        return payload;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload(T payload) {
        this.payload = payload;
    }

}
