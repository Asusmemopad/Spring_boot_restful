package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

public interface UserService {
    public Collection<User> findAllUsers();
    public User findById(int id);
    public boolean isUserExist(User user);
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUserById(int id);
    public void deleteAllUsers();
}
