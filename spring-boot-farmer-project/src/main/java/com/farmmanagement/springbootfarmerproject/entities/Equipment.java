package com.farmmanagement.springbootfarmerproject.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="equipment")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Equipment {

	public enum EquipmentTypes {
		TRACTOR, // TRAKTÖR
		CAR, // ARABA
		PARCEL_EQUIPMENT // TARLA EKİPMANI
	}

	@Id
	@Column(name = "equipment_id", nullable=false)
	private String equipmentId;
	
	@Column(name ="equipment_name")
	private String equipmentName;
	
	@ManyToOne
	@JoinColumn(name ="farm_id")
	private Farm farm;
	
	@Column(name ="equipment_type")
	private EquipmentTypes equipmentType;
	
	@OneToMany(mappedBy="equipment")
	@JsonIgnore
	private List<CareForEquipment> careForEquipment;

}
