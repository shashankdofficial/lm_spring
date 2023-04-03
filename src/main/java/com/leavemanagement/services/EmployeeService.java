package com.leavemanagement.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.leavemanagement.entities.Employee;

public interface EmployeeService {

	public ResponseEntity<Employee> insertEmployee(Employee employee);
	
	public ResponseEntity<Employee> updateCustomer(Employee employee,String email,String pass);
	
	public ResponseEntity<String> deleteCustomer(Employee employee);

	public List<Employee> getAllEmployee();

}
