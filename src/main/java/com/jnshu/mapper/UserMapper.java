package com.jnshu.mapper;

import com.jnshu.entity.User;

import java.util.List;

public interface UserMapper {
    int saveUser(User user);
    boolean updateUser(User user);
    User findUserById(int id);
    boolean deleteUser(int id);
    List<User> findAll();
}
