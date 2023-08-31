package com.meteor.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AfadianRequest {
    private String user_id;
    @JsonIgnore
    private String token;
    private long ts;
    private String sign;
    @JsonIgnore
    private Object param;
    private String params;
    public static ObjectMapper mapper = new ObjectMapper();

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    public String getParams() {
        return params;
    }

    public void setPrams(String params) {
        this.params = params;
    }

    public static ObjectMapper getMapper() {
        return mapper;
    }

    public static void setMapper(ObjectMapper mapper) {
        AfadianRequest.mapper = mapper;
    }

    public AfadianRequest init() {
        try {
            this.ts = System.currentTimeMillis() / 1000;
            this.params = mapper.writeValueAsString(this.param);
            String p = token + "params" + params  + "ts" + ts + "user_id" + user_id;
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.sign = new BigInteger(1, md.digest(p.getBytes(StandardCharsets.UTF_8))).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
}
