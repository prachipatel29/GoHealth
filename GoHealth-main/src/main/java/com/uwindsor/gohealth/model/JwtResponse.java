package com.uwindsor.gohealth.model;

import java.io.Serial;
import java.io.Serializable;

public class JwtResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 2887627935049604465L;

    private final String jwtToken;

    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return jwtToken;
    }
}
