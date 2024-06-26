package com.dev.space.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.space.dto.UserDto;
import com.dev.space.entity.User;
import com.dev.space.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/getAll")
	public List<User> getAllUser(){
		return service.getAll();
	}
	@GetMapping("/get")
	public User user(@RequestParam("UserId")int uid){
		return service.getUser(uid);
	}
	@PostMapping("/addUser")
	public User addUser(@RequestBody UserDto dto) {
		return service.addUser(dto);
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody UserDto dto) {
		return service.updateUser(dto);
	}
	
	@DeleteMapping("/deleteUser")
	public User deleteUser(@RequestParam("UserId")int uid) {
		return service.deleteUser(uid);		
	}

}
