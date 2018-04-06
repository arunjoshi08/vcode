package com.home.app.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.home.app.model.Vehicle;
import com.home.app.model.VehicleRequest;
import com.home.app.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	public ResponseEntity<String> save(VehicleRequest vReq){
		Vehicle v = new Vehicle();
		//v.setType(VehicleType.valueOf(vReq.getVehicleType()));
		//v.setVechicleNumber(vReq.getVehicleNumber());
		//v.setVehicleCompany(Company.valueOf(vReq.getVehicleCompany()));
		v.setCreatedAt(new Date());
		v.setUpdatedAt(new Date());
		vehicleRepository.save(v);
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}

}
