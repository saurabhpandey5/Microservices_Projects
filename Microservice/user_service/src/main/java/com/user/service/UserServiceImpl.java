package com.user.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.user.entity.User;

@Component
public class UserServiceImpl implements UserService {

	List<User> list= List.of(
			new User(1311L,"Surabh","87775757"),
			new User(1312L,"Sachin","122455"),
			new User(1313L,"Rohit","345555")
			);
	
	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user->user.getUserid().equals(id)).findAny().orElse(null);
	}

}
