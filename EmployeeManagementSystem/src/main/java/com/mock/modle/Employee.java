package com.mock.modle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	@NotNull(message = "Name is mandatory")
	private String empName;
	
	@Email(message="Enter your Email properly")
	@NotNull(message = "Email is mandatory")
	private String email;
	
	@NotNull(message="mendatroy")
	private String state;
	
	@NotNull(message = "Mobile is mandatory")
	private String mobile;
	
	
	@NotNull(message = "Password is mandatory")
	private String designation;
	
	
}
