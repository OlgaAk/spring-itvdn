package io.github.olgaak.dao;

import java.util.List;

import io.github.olgaak.entity.User;

public interface UserDao {
	
	void saveUser(User user);
	
	User getUserById(int id);
	
	void deleteUser(int id);
	
	void updateUser(User user);
	
	List<User> getAllUsers();
}
