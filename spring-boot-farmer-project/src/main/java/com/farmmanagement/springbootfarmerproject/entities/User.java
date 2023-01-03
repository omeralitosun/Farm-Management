package com.farmmanagement.springbootfarmerproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="userr")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@Column(name="user_id",nullable=false)
	private String userId;
	
	@OneToOne
	@JoinColumn(name="person_id",nullable=false)
	private Person person;
	
	@ManyToOne
	@JoinColumn(name="farm_id",nullable=false)
	private Farm farm;
	
	@Column(name="password",nullable=false)
	private String password;
	
	@Column(name="creation_date",nullable=false)
	private String creationDate;
	
	@Column(name="role")
	private String role;
}
