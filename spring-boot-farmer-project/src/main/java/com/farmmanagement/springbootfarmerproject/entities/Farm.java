package com.farmmanagement.springbootfarmerproject.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.farmmanagement.springbootfarmerproject.entities.item.PurchasedItem;
import com.farmmanagement.springbootfarmerproject.entities.item.SoldItem;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="farm")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Farm {

	@Id
	@Column(name="farm_id")
	private String farmId;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="farm")
	@JsonIgnore
	private List<User> users;
	
	@OneToMany(mappedBy="farm")
	@JsonIgnore
	private List<Parcel> parcels;
	
	@OneToMany(mappedBy="farm")
	@JsonIgnore
	private List<Equipment> equipments;	
	
	@OneToMany(mappedBy="farm")
	@JsonIgnore
	private List<PurchasedItem> purchasedItems;
	
	@OneToMany(mappedBy="farm")
	@JsonIgnore
	private List<SoldItem> soldItems;
	
}
