package com.uwindsor.gohealth.service.impl;

import com.uwindsor.gohealth.entity.User;
import com.uwindsor.gohealth.model.UserRequest;
import com.uwindsor.gohealth.repository.UserRepository;
import com.uwindsor.gohealth.service.RoleService;
import com.uwindsor.gohealth.service.UserService;
import com.uwindsor.gohealth.utility.PasswordUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = null;
        try {
            user = userRepository.findByMobileNo(Long.valueOf(username));
            if (user == null) {
                throw new UsernameNotFoundException(username);
            }
        } catch (Exception e) {
            throw new UsernameNotFoundException(e.getMessage());
        }
        return user;
    }

    @Override
    public void register(UserRequest userRequest) throws Exception {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setMobileNo(userRequest.getMobileNo());
        user.setAddress(userRequest.getAddress());
        user.setStatus(true);
        user.setAge(userRequest.getAge());
        user.setSex(userRequest.getSex());
        user.setAuthorities(roleService.roles());
        user.setPassword(PasswordUtility.encode(userRequest.getPassword()));
        userRepository.save(user);

    }
}
