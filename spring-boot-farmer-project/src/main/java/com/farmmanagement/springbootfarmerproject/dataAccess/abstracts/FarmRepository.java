package com.farmmanagement.springbootfarmerproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmmanagement.springbootfarmerproject.entities.Farm;

@Repository
public interface FarmRepository extends JpaRepository<Farm, String>{

}
