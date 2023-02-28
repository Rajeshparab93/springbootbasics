package com.csi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class ApplicationController {
	
	@GetMapping
	public String sayHello() {
		
		return "Welcome To Infosys.....";
	}
	
	@GetMapping("/depts")
	public String sayDepartment() {
		
		return "IT | ADMIN | HR";
	}

	@GetMapping("/location")
	public String sayLocation() {
		
		return "Pune";
	}
	
	@GetMapping("/listofemployeedata")
	public List<Employee> getAllData() {
		
		return Stream.of(new Employee(1, "Raj"),(new Employee(2, "Rakhi"))).collect(Collectors.toList());
	}


}
