package io.github.olgaak.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import io.github.olgaak.entity.User;
import io.github.olgaak.mapper.UserMapper;

public class UserDaoImpl implements UserDao {

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

	@Override
	public void saveUser(User user) {
		String sql = "INSERT INTO users (name, email, age) VALUES(?, ?, ?)";
		jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
	}

	@Override
	public User getUserById(int id) {
		String sql = "SELECT * FROM users WHERE id=?";
		return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
	}

	@Override
	public void deleteUser(int id) {
		String sql = "DELETE FROM users WHERE id=?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void updateUser(User user) {
		String sql = "UPDATE users SET name=? email=? age=? WHERE id=?";
		jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge(), user.getId());
	}

}
