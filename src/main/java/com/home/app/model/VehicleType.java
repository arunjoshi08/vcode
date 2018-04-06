package com.home.app.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vehicleType")
public class VehicleType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2437730869146194950L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "type")
	private String type;

	@Column(name = "subType")
	private String subType;

	@Column(name = "category")
	private String category;

	 @OneToMany(mappedBy="vehicleType",cascade=CascadeType.ALL)
	 private Set<Vehicle> vehicle = new HashSet<Vehicle>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Set<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}	

}
