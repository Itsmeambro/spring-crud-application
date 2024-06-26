package com.dev.space.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.space.dto.UserDto;
import com.dev.space.entity.User;
import com.dev.space.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User addUser(UserDto dto) {
		User user = new User();
		try {
			BeanUtils.copyProperties(dto, user);
			user = userRepo.save(user);
			return user;
			
		}catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public User updateUser(UserDto dto) {
		
		User user = new User();
		try {
			BeanUtils.copyProperties(dto, user);
			user = userRepo.save(user);
			return user;
			
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public User deleteUser(int uid) {
		Optional<User> optional = userRepo.findById(uid);
		userRepo.deleteById(uid);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public User getUser(int uid) {
		Optional<User> optional = userRepo.findById(uid);
		userRepo.deleteById(uid); 
		
		if(optional.isPresent()) {
			return optional.get();
		}
		
		return null;
	}

	@Override
	public List<User> getAll() {
		return userRepo.findAll();
	}
	
}
