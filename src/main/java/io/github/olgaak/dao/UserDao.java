package io.github.olgaak.dao;

import java.util.List;

import io.github.olgaak.entity.User;

public interface UserDao {
	
	List<User> getAllUsers();
}
