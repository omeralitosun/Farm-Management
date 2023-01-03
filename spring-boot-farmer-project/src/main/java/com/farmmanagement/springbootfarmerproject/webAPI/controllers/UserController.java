package com.farmmanagement.springbootfarmerproject.webAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.farmmanagement.springbootfarmerproject.business.abstracts.UserService;
import com.farmmanagement.springbootfarmerproject.business.responses.GetUserResponse;
import com.farmmanagement.springbootfarmerproject.entities.User;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	@ResponseBody
	public void add(@RequestBody User user) {	
		userService.add(user);
	}
	
	@GetMapping("/get")
	public GetUserResponse getById() {
		return null;
	}
}
