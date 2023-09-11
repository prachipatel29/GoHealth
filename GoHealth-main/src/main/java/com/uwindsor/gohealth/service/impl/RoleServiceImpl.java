package com.uwindsor.gohealth.service.impl;

import com.uwindsor.gohealth.entity.Role;
import com.uwindsor.gohealth.repository.RoleRepository;
import com.uwindsor.gohealth.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Set<Role> roles() {
        List<Role> roles= roleRepository.findAll();
        return new HashSet<>(roles);
    }
}
