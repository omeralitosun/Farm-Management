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

@Table(name = "action_for_parcel")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ActionForParcel {

	public enum Actions {
		SOIL_PREPARATION, // TOPRAK HAZIRLAMA
		SOWING, // EKİM YAPMAK
		FIELD_SPRAYING, // ÜRÜN İLAÇLAMA
		MAINTENANCE, // BAKIM
		IRRIGATION, // SULAMA
		HARVEST, // BİÇİM
		OTHER, // DİĞER
	}
	
	@Id
	@Column(name = "action_for_parcel_id", nullable = false)
	private String actionForParcelId;
	
	@ManyToOne
	@JoinColumn(name = "parcel")
	private Parcel parcel;
	
	@Column(name = "action")
	private Actions action;
	
	@Column(name = "cost_per_decare")
	private Double costPerDecare;
	
	@Column(name = "commet")
	private String commnet;
	
	@Column(name = "transaction_date")
	private String transactionDate;
}
