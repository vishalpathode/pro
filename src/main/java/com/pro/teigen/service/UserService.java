package com.pro.teigen.service;

import com.pro.teigen.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User getUserByEmail(String email);
}
