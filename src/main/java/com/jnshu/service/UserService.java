package com.jnshu.service;

import com.jnshu.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
  int saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

    User findUserById(int id);

    List<User> findAll();


}
