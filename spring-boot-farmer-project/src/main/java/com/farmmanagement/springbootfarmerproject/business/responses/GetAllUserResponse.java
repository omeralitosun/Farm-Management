package com.farmmanagement.springbootfarmerproject.business.responses;

import com.farmmanagement.springbootfarmerproject.entities.Farm;
import com.farmmanagement.springbootfarmerproject.entities.Person;

public class GetAllUserResponse {

	private String userId;
	private Person person;
	private Farm farm;
	private String password;
	private String creationDate;
	private String role;
}
