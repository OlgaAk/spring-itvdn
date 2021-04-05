package io.github.olgaak.service;

import java.util.List;

import io.github.olgaak.entity.User;

public interface UserService {
	
	void saveUser(User user);
	
	User getUserById(int id);
	
	void deleteUser(int id);
	
	void updateUser(User user);
	
	List<User> getAllUsers();
}

