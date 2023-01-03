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

@Table(name="parcel")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parcel {

	@Id
	@Column(name = "parcel_id",nullable=false)
	private String parcelId;
	
	@Column(name = "parcel_name")
	private String parcelName;
	
	@ManyToOne
	@JoinColumn(name="farm_id")
	private Farm farm;
	
	@Column(name = "square_meter")
	private Double squareMeter;
	
	@OneToMany(mappedBy="parcel")
	@JsonIgnore
	private List<ActionForParcel> actionsForParcel;
}
