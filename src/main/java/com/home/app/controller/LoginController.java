package com.home.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.home.app.model.VehicleRequest;
import com.home.app.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@RequestMapping("user")
public class LoginController {
	
	@Autowired
	UserService userService;

	// login()
	// register()
	@ApiOperation(value = "Save a vehicle's details which  passes from any tollbooth")
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> login(@ApiParam(value = "username", required = true) @RequestParam String username,
			@ApiParam(value = "username", required = true) @RequestParam String password) {
		try{
		// user login validation if required.
		userService.login(username,password);
		}catch(Exception e){
			System.out.println(e);
		}
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}

	/*
	 * @ApiOperation(value =
	 * "Save a vehicle's details which  passes from any tollbooth")
	 * 
	 * @RequestMapping(value = "/login", method = RequestMethod.POST, produces =
	 * MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<String>
	 * login(@ApiParam(value = "vehicle request object", required =
	 * true)@RequestBody VehicleRequest vehicleRequest){ // vehicle validation
	 * if required. //return vehicleService.save(vehicleRequest); }
	 * 
	 * @ApiOperation(value =
	 * "Save a vehicle's details which  passes from any tollbooth")
	 * 
	 * @RequestMapping(value = "/registration", method = RequestMethod.POST,
	 * produces = MediaType.APPLICATION_JSON_VALUE) public
	 * ResponseEntity<String> registration(@ApiParam(value =
	 * "vehicle request object", required = true)@RequestBody VehicleRequest
	 * vehicleRequest){ // vehicle validation if required. //return
	 * vehicleService.save(vehicleRequest); }
	 */

}
