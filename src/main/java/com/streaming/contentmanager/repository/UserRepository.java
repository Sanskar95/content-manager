package com.streaming.contentmanager.repository;

import com.streaming.contentmanager.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
