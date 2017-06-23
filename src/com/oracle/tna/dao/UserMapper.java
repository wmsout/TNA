package com.oracle.tna.dao;

import org.springframework.stereotype.Repository;

import com.oracle.tna.domain.User;



//写对应的接口，接口里写对应的方法
@Repository
public interface UserMapper {
	
	public User selectByusername(String username);	
	
}
