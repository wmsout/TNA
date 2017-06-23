package com.oracle.tna.service;

import mybatis.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.oracle.tna.dao.UserMapper;
import com.oracle.tna.domain.User;

@Service
public class LoginService {

	private static LoginService loginService = new LoginService();
	
	private LoginService(){};
	
	public static LoginService getLoginService(){
		return loginService;
	}
	
	public User getUser(String username){
		SqlSession session = mybatis.getSqlSession(true);
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = new User();
		user = userMapper.selectByusername(username);
		return user;
	}
	
	
}
