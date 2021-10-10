package com.streaming.contentmanager.repository;

import com.streaming.contentmanager.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findRoleByName(String name);
}
