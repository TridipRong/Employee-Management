package com.mock.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mock.modle.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	
}
