package kz.iitu.springsecurityexample.service;


import kz.iitu.springsecurityexample.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void createUser(User user);
    void updateUser(Long id, User user);
}
