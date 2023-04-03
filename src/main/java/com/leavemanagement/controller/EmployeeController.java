package com.leavemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leavemanagement.entities.Employee;
import com.leavemanagement.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
    
	@CrossOrigin
	@GetMapping("/allemp")
	public ResponseEntity<List<Employee>> test() {
		return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
	}
	
	@CrossOrigin
	@PostMapping("/saveemp")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		return employeeService.insertEmployee(employee);
	}
}
