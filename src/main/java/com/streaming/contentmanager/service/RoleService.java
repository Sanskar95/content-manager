package com.streaming.contentmanager.service;

import com.streaming.contentmanager.model.Role;
import com.streaming.contentmanager.repository.RoleRepository;
import org.springframework.stereotype.Service;


@Service(value = "roleService")
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findByName(String name) {
        Role role = roleRepository.findRoleByName(name);
        return role;
    }

}
