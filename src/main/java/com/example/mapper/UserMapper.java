package com.example.mapper;

import com.example.domain.User;

public interface UserMapper {
	User selectUserById(int id);
	User selectUserByUsername(int id);
	void insertUser(User user);
}
	