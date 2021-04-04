package io.github.olgaak.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import io.github.olgaak.entity.User;

public class UserDaoImpl implements UserDao{

	public final JdbcTemplate jdbcTeplate;	

	@Autowired
	public UserDaoImpl(JdbcTemplate jdbcTeplate) {
		this.jdbcTeplate = jdbcTeplate;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
