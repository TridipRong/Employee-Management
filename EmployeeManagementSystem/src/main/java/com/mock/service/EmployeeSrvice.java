package com.mock.service;

import com.mock.exception.EmployeeException;
import com.mock.modle.Employee;

public interface EmployeeSrvice {
	public Employee createEmployee(Employee empcreate) throws EmployeeException;
	public Employee getEmployeeById(Integer empId)throws EmployeeException;
	
	
}
