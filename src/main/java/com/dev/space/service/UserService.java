package com.dev.space.service;

import java.util.List;

import com.dev.space.dto.UserDto;
import com.dev.space.entity.User;

public interface UserService {

	User addUser(UserDto dto);

	User updateUser(UserDto dto);

	User deleteUser(int uid);

	User getUser(int uid);
	
	List<User> getAll();

}
