package com.farmmanagement.springbootfarmerproject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmmanagement.springbootfarmerproject.business.abstracts.FarmService;
import com.farmmanagement.springbootfarmerproject.business.requests.CreateFarmRequest;
import com.farmmanagement.springbootfarmerproject.business.requests.UpdateFarmRequest;
import com.farmmanagement.springbootfarmerproject.business.responses.GetAllFarmResponse;
import com.farmmanagement.springbootfarmerproject.business.responses.GetFarmByIdResponse;
import com.farmmanagement.springbootfarmerproject.business.responses.GetFarmResponse;
import com.farmmanagement.springbootfarmerproject.dataAccess.abstracts.FarmRepository;
import com.farmmanagement.springbootfarmerproject.mappers.FarmMapper;

@Service
public class FarmManager implements FarmService {

	@Autowired
	private FarmRepository farmRepository;

	@Override
	public List<GetAllFarmResponse> getAll() {
		return FarmMapper.MAPPER.mapToGetAllFarmResponse(farmRepository.findAll());
	}

	@Override
	public void add(CreateFarmRequest farm) {
		farmRepository.save(FarmMapper.MAPPER.mapToFarm(farm));
	}

	@Override
	public void deleteById(String id) {
		farmRepository.deleteById(id);
	}

	@Override
	public void update(UpdateFarmRequest farm) {
		farmRepository.save(FarmMapper.MAPPER.mapToFarm(farm));
	}

	@Override
	public GetFarmByIdResponse getById(String id) {
		return FarmMapper.MAPPER.mapToGetFarmByIdResponse(farmRepository.getReferenceById(id));
	}

}
