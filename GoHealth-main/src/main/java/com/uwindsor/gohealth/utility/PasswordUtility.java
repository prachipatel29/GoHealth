package com.uwindsor.gohealth.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

public interface PasswordUtility {

    public static String encode(String toBeEncoded) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(toBeEncoded);
        return hashedPassword;
    }

}
