package com.mock.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mock.exception.EmployeeException;
import com.mock.modle.Employee;
import com.mock.service.EmployeeSrvice;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController

public class EmployeeController {
	private static final int ResponseEntity = 0;
	@Autowired 
	EmployeeSrvice employeeService;
	 @PostMapping("/employee")
	 public ResponseEntity<Employee> saveAdmin(@Valid @RequestBody Employee employee)throws EmployeeException {
			
			return new ResponseEntity<Employee>(employeeService.createEmployee(employee),HttpStatus.OK);
		}
	 
	  @GetMapping("/employee/{empId}")
			public ResponseEntity<Employee> getemployeebyempidandeller(@PathVariable("empId") Integer empId) throws EmployeeException{

		  Employee emp=employeeService.getEmployeeById(empId);
		  return new ResponseEntity<Employee>(employeeService.createEmployee(emp),HttpStatus.OK);
				
				
			}
}
