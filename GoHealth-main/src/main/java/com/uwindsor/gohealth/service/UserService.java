package com.uwindsor.gohealth.service;

import com.uwindsor.gohealth.entity.User;
import com.uwindsor.gohealth.model.UserRequest;

public interface UserService {

    void register(UserRequest userRequest) throws Exception;
}
