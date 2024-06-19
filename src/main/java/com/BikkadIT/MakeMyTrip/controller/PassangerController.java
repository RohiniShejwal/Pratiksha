package com.BikkadIT.MakeMyTrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.BikkadIT.MakeMyTrip.model.Passanger;
import com.BikkadIT.MakeMyTrip.model.Ticket;
import com.BikkadIT.MakeMyTrip.service.PassangerServiceI;

@RestController
public class PassangerController {

	@Autowired
	private PassangerServiceI passangerServiceI;
	
	
	// Save Data 
	
	@PostMapping(value= "/SaveData", consumes = "application/json")
	public ResponseEntity<Ticket> savedata(@RequestBody Passanger psng){
		Ticket saveData = passangerServiceI.SaveData(psng);
	   return new ResponseEntity<Ticket>(saveData, HttpStatus.OK);	
	}
	
	@PostMapping(value= "/SaveData", consumes = "application/json")
	public ResponseEntity<Ticket> savedata(@RequestBody Passanger psng){
		Ticket saveData = passangerServiceI.SaveData(psng);
	   return new ResponseEntity<Ticket>(saveData, HttpStatus.OK);	
	}
	
	//Get Data
	
//	@GetMapping(value = "/getAllData", produces = "application/json")
//	public ResponseEntity <List<Passanger>> getalldata(){
//		passangerServiceI.
//		return new ResponseEntity <List<Flight>>(getalldata, HttpStatus.OK);
//		
		
	}

