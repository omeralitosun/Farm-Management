package com.farmmanagement.springbootfarmerproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmmanagement.springbootfarmerproject.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
