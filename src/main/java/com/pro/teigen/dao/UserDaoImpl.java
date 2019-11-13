package com.pro.teigen.dao;

import com.pro.teigen.model.User;
import com.pro.teigen.repository.UserRepository;
import com.pro.teigen.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserDaoImpl implements UserDao{

	static String USER_ROLE = "USER";
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		String password = PasswordUtil.getPasswordHash(user.getPassword());
		user.setPassword(password);
		user.setCreatedDate(new Date());
		user.setEnabled(true);
		user.setRole(USER_ROLE);
		return userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepository.findByEmailIgnoreCase(email);
	}
}
