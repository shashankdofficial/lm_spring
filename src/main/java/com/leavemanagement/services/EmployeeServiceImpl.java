package com.leavemanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.leavemanagement.entities.Employee;
import com.leavemanagement.exceptions.UserNameAlreadyExist;
import com.leavemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public ResponseEntity<Employee> insertEmployee(Employee employee) {
		Employee emp = employeeRepository.findByEmail(employee.getEmail());
		if(emp != null) throw new UserNameAlreadyExist("username already exist");
		employeeRepository.save(employee);
		ResponseEntity<Employee> re = new ResponseEntity<>(employee,HttpStatus.CREATED);
		return re;
	}

	@Override
	public ResponseEntity<Employee> updateCustomer(Employee employee, String email, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> deleteCustomer(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

}
