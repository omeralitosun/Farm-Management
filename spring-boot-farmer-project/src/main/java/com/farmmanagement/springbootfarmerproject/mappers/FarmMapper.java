package com.farmmanagement.springbootfarmerproject.mappers;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.farmmanagement.springbootfarmerproject.business.requests.CreateFarmRequest;
import com.farmmanagement.springbootfarmerproject.business.requests.UpdateFarmRequest;
import com.farmmanagement.springbootfarmerproject.business.responses.GetAllFarmResponse;
import com.farmmanagement.springbootfarmerproject.business.responses.GetFarmByIdResponse;
import com.farmmanagement.springbootfarmerproject.entities.Farm;

@Mapper
public interface FarmMapper {
	
	public FarmMapper MAPPER = Mappers.getMapper(FarmMapper.class);
	
	public Farm mapToFarm (CreateFarmRequest farm);
	public Farm mapToFarm (UpdateFarmRequest farm);
	public List<GetAllFarmResponse> mapToGetAllFarmResponse(List<Farm> farm);
	public GetFarmByIdResponse mapToGetFarmByIdResponse(Farm farm);
}
