package com.farmmanagement.springbootfarmerproject.business.requests;

import com.farmmanagement.springbootfarmerproject.helpers.CreatId;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateFarmRequest {

	private String farmId;
	private String name;
	
	public CreateFarmRequest(String farmId, String name) {
		this.farmId = CreatId.creatRandomId();
		this.name = name;
	}
	
	public void setFarmId(String farmId) {
		this.farmId = CreatId.creatRandomId();
	}
	
}
