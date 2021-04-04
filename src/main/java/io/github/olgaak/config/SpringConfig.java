package io.github.olgaak.config;

import io.github.olgaak.dao.UserDao;
import io.github.olgaak.dao.UserDaoImpl;
import io.github.olgaak.service.UserService;
import io.github.olgaak.service.UserServiceImpl;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/test?useSll=false");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}
	
	@Bean
	public UserDao getUserDao() {
		return new UserDaoImpl(getJdbcTemplate());
	}
	
	@Bean
	public UserService getUserService() {
		return new UserServiceImpl();
	}
}
