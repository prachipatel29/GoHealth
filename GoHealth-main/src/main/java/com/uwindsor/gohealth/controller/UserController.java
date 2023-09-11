package com.uwindsor.gohealth.controller;

import com.uwindsor.gohealth.entity.User;
import com.uwindsor.gohealth.model.UserRequest;
import com.uwindsor.gohealth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserRequest> register(@RequestBody UserRequest userRequest) throws Exception {

        userService.register(userRequest);

        return ResponseEntity.ok(userRequest);

    }
}
