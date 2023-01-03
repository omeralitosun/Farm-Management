package com.farmmanagement.springbootfarmerproject.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EquipmentMapper {

	public EquipmentMapper MAPPER = Mappers.getMapper(EquipmentMapper.class);
	
}
