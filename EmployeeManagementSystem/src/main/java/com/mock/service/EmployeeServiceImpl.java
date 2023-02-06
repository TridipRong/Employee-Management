package com.mock.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.exception.EmployeeException;
import com.mock.modle.Employee;
import com.mock.repo.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeSrvice{
	@Autowired
	private EmployeeDao employeedao;
	
	
	

	@Override
	public Employee createEmployee(Employee empcreate) throws EmployeeException{

		
		return employeedao.save(empcreate);
	}




	
	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		Optional<Employee> opt=employeedao.findById(empId);
		
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new EmployeeException("Employee does not exist with this empId "+empId);
			
		}
		
	}
	

}
