package com.example.service;

// import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.domain.User;


@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public void registerUser(User user) {
		userMapper.insertUser(user);
	}

	public User getUser(int id) {
		return userMapper.selectUserById(id);
	}
}
