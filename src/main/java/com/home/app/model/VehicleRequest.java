package com.home.app.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="VehicleRequest", description="Request model for Vehicle to be saved")
public class VehicleRequest {
	@ApiModelProperty(value = "vehicle type", allowableValues = "LMV,HMV,TwoWheelers")
	String vehicleType;
	@ApiModelProperty(value = "vehicle company", allowableValues = "Maruti,Tata,Hyundai")
	String vehicleCompany;
	@ApiModelProperty(value = "vehicle Number")
	String vehicleNumber;

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleCompany() {
		return vehicleCompany;
	}

	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

}
