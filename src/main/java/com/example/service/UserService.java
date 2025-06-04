package com.example.service;

// import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct; 

import com.example.mapper.UserMapper;
import com.example.domain.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	// @PostConstruct // 의존성 주입 완료된 직후 자동 실행되는 메서드, javax.annotation-api 의존성 추가 필요
	public void init() {
		try {
			userMapper.createUserTable();
		} catch (Exception e) {
			throw new RuntimeException("테이블 생성 실패", e);
		}
	}

	public void registerUser(User user) {
		try {
			userMapper.insertUser(user);
		} catch (Exception e) {
			throw new RuntimeException("회원 등록 실패", e);
		}
	}

	public User getUser(int id) {
		return userMapper.selectUserById(id);
	}

}
