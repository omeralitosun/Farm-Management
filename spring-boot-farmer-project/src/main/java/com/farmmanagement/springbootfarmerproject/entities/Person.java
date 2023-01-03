package com.farmmanagement.springbootfarmerproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="person")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

	@Id
	@Column(name="person_id",nullable=false)
	private String personId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="sur_name")
	private String surName;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
}
