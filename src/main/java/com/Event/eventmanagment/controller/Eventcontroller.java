package com.Event.eventmanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Event.eventmanagment.model.EventDTO;
import com.Event.eventmanagment.service.Eventservice;


@RestController
@RequestMapping("/Event")
public class Eventcontroller {
	@Autowired
	 Eventservice service;

	@PostMapping("/create")
	public String postallDetails(@RequestBody EventDTO dto) {
		return service.postallDetails(dto);
	}
	@GetMapping("/get/{id}")
	public EventDTO getEventId(@PathVariable int id) {
		return service.getEventId(id);
		
	}
	@PutMapping("/update/{id}")
	public String getUpdateId(@PathVariable int id) {
		return service.getUpdateId(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
		
	}
	@GetMapping("/getall")
	public List<EventDTO> getAll(){
		return service.getAll();
	}
	@GetMapping("/getNameAndPassword")
	public EventDTO getEventByNameandPassword(@RequestParam String name,@RequestParam String password) {
		return service.getEventByNameandPassword(name, password);
	}

}
