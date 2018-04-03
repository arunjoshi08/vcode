package com.home.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.app.model.VehicleRequest;
import com.home.app.service.VehicleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@RequestMapping("vehicle")
@Api(description = "Vehicle API", tags = "VehicleResource")
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;

	@ApiOperation(value = "Save a vehicle's details which  passes from any tollbooth")
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveVehicle(@ApiParam(value = "vehicle request object", required = true)@RequestBody VehicleRequest vehicleRequest){
		// vehicle validation if required.
		return vehicleService.save(vehicleRequest);
	}
	
	@ApiOperation(value = "Save a vehicle's details which  passes from any tollbooth")
	@RequestMapping(value = "/queryByVehicleNumber", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void queryVehicleByVehicleNumber(String vehicleNumber){
		// vehicle validation if required.
		//vehicleService.save();
	}
}
