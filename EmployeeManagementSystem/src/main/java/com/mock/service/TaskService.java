package com.mock.service;

import com.mock.exception.TasksException;
import com.mock.modle.Tasks;

public interface TaskService {

	public Tasks registerTasks(Tasks ts)throws TasksException;
	public Tasks deleteTasksById(Integer tsId)throws TasksException;
	public Tasks updateTasks(Tasks ts)throws TasksException;

}