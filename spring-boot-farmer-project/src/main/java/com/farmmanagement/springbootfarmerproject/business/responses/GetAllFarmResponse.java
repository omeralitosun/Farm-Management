package com.farmmanagement.springbootfarmerproject.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllFarmResponse {

	private String farmId;
	private String name;
}
