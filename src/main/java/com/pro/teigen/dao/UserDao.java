package com.pro.teigen.dao;


import com.pro.teigen.model.User;

import java.util.List;

public interface UserDao {

	User save(User user);

	List<User> findAll();

	User getUserByEmail(String email);

}
