package com.uwindsor.gohealth.model;

import java.io.Serial;
import java.io.Serializable;

public class JwtRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 515111427784454572L;

    private String userId;
    private String password;

    public JwtRequest() {

    }

    public JwtRequest(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
