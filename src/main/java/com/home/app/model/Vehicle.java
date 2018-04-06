package com.home.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Vehicle")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Vehicle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6951274164977642417L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne (cascade=CascadeType.ALL)
	private VehicleType vehicleType;
	
	@Column(name="passanger_vehicle")
	private Boolean passangerVehicle;
	
	@Column(name="goods_vehicle")
	private Boolean goodsVehicle;
	

	@Column(name="vehicleFrom")
	private String vehicleFrom;

	@Column(name="vehicleTo")
	private String vehicleTo;
	
	@Column(name="location")
	private String location;
	
	@Column(name="roadName")
	private String roadName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dayTime")
	private Date  dayTime;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;
	
	@Column(name="createdBy")
	private String createdBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleFrom() {
		return vehicleFrom;
	}

	public void setVehicleFrom(String vehicleFrom) {
		this.vehicleFrom = vehicleFrom;
	}

	public String getVehicleTo() {
		return vehicleTo;
	}

	public void setVehicleTo(String vehicleTo) {
		this.vehicleTo = vehicleTo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public Date getDayTime() {
		return dayTime;
	}

	public void setDayTime(Date dayTime) {
		this.dayTime = dayTime;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
