package com.meteor.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AfadianResponseData {
    @JsonProperty("ec")
    private int ec;
    @JsonProperty("em")
    private String em;
    @JsonProperty("data")
    private Object data;

    public AfadianResponseData(){
        super();
    }

    public AfadianResponseData(int ec, String em, Object data) {
        this.ec = ec;
        this.em = em;
        this.data = data;
    }

    public int getEc() {
        return ec;
    }

    public void setEc(int ec) {
        this.ec = ec;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
