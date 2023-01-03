package com.farmmanagement.springbootfarmerproject.business.abstracts;

import java.util.List;

import com.farmmanagement.springbootfarmerproject.business.responses.GetUserResponse;
import com.farmmanagement.springbootfarmerproject.entities.User;

public interface UserService {

	List<User> getAll();
	void add(User user);
	void deleteById(String id);
	
}
