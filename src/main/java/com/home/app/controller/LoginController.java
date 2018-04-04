package com.home.app.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.app.model.VehicleRequest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@RequestMapping("user")
public class LoginController {
	
//	login()
//	register()
	
	/*@ApiOperation(value = "Save a vehicle's details which  passes from any tollbooth")
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> login(@ApiParam(value = "vehicle request object", required = true)@RequestBody VehicleRequest vehicleRequest){
		// vehicle validation if required.
		//return vehicleService.save(vehicleRequest);
	}
	
	@ApiOperation(value = "Save a vehicle's details which  passes from any tollbooth")
	@RequestMapping(value = "/registration", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> registration(@ApiParam(value = "vehicle request object", required = true)@RequestBody VehicleRequest vehicleRequest){
		// vehicle validation if required.
		//return vehicleService.save(vehicleRequest);
	}*/

}
