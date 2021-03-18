package com.example.springboot_jwt.dao;

import com.example.springboot_jwt.models.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository <DAOUser, Integer> {
        DAOUser findByUsername(String username);
}
