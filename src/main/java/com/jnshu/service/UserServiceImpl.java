package com.jnshu.service;

import com.jnshu.entity.User;
import com.jnshu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper userMapper;
    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);

    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
