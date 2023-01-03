package com.farmmanagement.springbootfarmerproject.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetFarmByIdResponse {
	
	private String farmId;
	private String name;
	
}
