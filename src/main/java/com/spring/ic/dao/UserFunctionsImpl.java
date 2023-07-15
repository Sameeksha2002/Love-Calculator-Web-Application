package com.spring.ic.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.ic.api.UserInfoDTO;

public class UserFunctionsImpl implements UserFunctions {

	@Autowired
	private JdbcTemplate jdbc;
	
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	@Override
	public void insertUsers(UserInfoDTO userInfo) {
		String sql = "INSERT INTO USERS "
		
	}

	
}
