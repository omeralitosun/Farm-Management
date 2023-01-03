package com.farmmanagement.springbootfarmerproject.business.abstracts;

import java.util.List;

import com.farmmanagement.springbootfarmerproject.entities.Person;

public interface PersonService {

	List<Person> getAll();
	void add(Person person);
}
