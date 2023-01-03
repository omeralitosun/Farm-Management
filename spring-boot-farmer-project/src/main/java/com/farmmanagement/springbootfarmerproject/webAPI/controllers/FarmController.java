package com.farmmanagement.springbootfarmerproject.webAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.farmmanagement.springbootfarmerproject.business.abstracts.FarmService;
import com.farmmanagement.springbootfarmerproject.business.requests.CreateFarmRequest;
import com.farmmanagement.springbootfarmerproject.business.responses.GetAllFarmResponse;
import com.farmmanagement.springbootfarmerproject.business.responses.GetFarmResponse;


@RestController
@RequestMapping("/api/farm")
public class FarmController {

	
	@Autowired
	private FarmService farmService;
	
	@PostMapping("/add")
	@ResponseBody
	public void add(@RequestBody CreateFarmRequest farm) {	
		farmService.add(farm);
	}
	
	@GetMapping("/getAll")
	public List<GetAllFarmResponse> getAll(){
		return farmService.getAll();
	}
	
	@GetMapping("/get/{id}")
	public GetFarmResponse getById(@PathVariable(value="id") String id) {
		return farmService.getById(id);
	}

}
