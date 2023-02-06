package com.mock.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mock.exception.TasksException;
import com.mock.modle.Tasks;
import com.mock.service.TaskService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
public class TasksController {
	@Autowired
	private TaskService tsService;
	
	
	@PostMapping("/task")
	 public ResponseEntity<Tasks> registerTasks(@Valid @RequestBody Tasks tsk)throws TasksException {
		
		return new ResponseEntity<Tasks>(tsService.registerTasks(tsk),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/tasks/{id}")
	public ResponseEntity<Tasks> DeleteEmployeeByIdhandeller(@PathVariable("id") Integer tsId) throws TasksException{

		
		Tasks ts=tsService.deleteTasksById(tsId);
		
		return new ResponseEntity<Tasks>(ts,HttpStatus.OK);
			
		
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Tasks> updateEmployee(@RequestBody Tasks ts) throws TasksException{

		
		
	Tasks ts1 = tsService.updateTasks(ts);
	
	
	return new ResponseEntity<Tasks>(ts1,HttpStatus.OK);
	
	}
}
