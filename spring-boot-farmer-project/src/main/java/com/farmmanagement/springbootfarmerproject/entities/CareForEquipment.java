package com.farmmanagement.springbootfarmerproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="care_for_equipment")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CareForEquipment {

	public enum Actions {
		MAINTENANCE, //BAKIM
		PARTS_REPLACEMENT, //PARÇA DEĞİŞİMİ
		OTHER // DİĞER
	}

	@Id
	@Column(name = "care_for_equipment_ıd",nullable=false)
	private String careForEquipmentId;
	
	@ManyToOne
	@JoinColumn(name="equipment")
	private Equipment equipment;
	
	@Column(name = "action")
	private Actions action;
	
	@Column(name = "cost")
	private Double cost;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="transaction_date")
	private String transactionDate;
	
}
