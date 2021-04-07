package io.github.olgaak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.olgaak.dao.UserDao;
import io.github.olgaak.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

}
