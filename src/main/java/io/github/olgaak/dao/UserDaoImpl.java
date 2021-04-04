package io.github.olgaak.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import io.github.olgaak.entity.User;
import io.github.olgaak.mapper.UserMapper;

public class UserDaoImpl implements UserDao{

	public final JdbcTemplate jdbcTemplate;	

	@Autowired
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<User> getAllUsers() {
		String sql = "SELECT * FROM users";
		return jdbcTemplate.query(sql, new UserMapper());
	}

}
