package com.farmmanagement.springbootfarmerproject.entities.item;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.farmmanagement.springbootfarmerproject.entities.Farm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Item {
	
	public enum Units{
		NUMBER, // ADET
		KG, //KİLOGRAM
		LITER // LİTRE
	}
	
	@Id
	@Column(name = "item_id",nullable=false)
	private String itemId;
	
	@ManyToOne
	@JoinColumn(name="farm_id")
	private Farm farm;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "measurement")
	private Double Measurement;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "unit")
	private Units unit;
	
	@Column(name = "commet")
	private String commnet;
	
	@Column(name = "transaction_date")
	private String transactionDate;
}
