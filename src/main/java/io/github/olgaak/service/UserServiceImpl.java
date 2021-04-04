package io.github.olgaak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.github.olgaak.dao.UserDao;
import io.github.olgaak.entity.User;

public class UserServiceImpl implements UserService{
	
	@Autowired
	public UserDao userDao;

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
