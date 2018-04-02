package com.home.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.app.model.Vehicle;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("vehicle")
@Api(description = "Vehicle API", tags = "VehicleResource")
public class VehicleController {

	@ApiOperation(value = "Save a vehicle details which  passes from any tollbooth")
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void saveVehicle(@RequestBody Vehicle vehicleRequest){
		
	}
}
