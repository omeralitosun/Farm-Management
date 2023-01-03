package com.farmmanagement.springbootfarmerproject.business.abstracts;

import java.util.List;

import com.farmmanagement.springbootfarmerproject.business.requests.CreateFarmRequest;
import com.farmmanagement.springbootfarmerproject.business.requests.UpdateFarmRequest;
import com.farmmanagement.springbootfarmerproject.business.responses.GetAllFarmResponse;
import com.farmmanagement.springbootfarmerproject.business.responses.GetFarmByIdResponse;

public interface FarmService {
	
	List<GetAllFarmResponse> getAll();
	void add(CreateFarmRequest farm);
	void deleteById(String id);
	void update(UpdateFarmRequest farm);
	GetFarmByIdResponse getById(String id);
}
