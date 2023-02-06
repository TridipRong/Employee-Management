package com.mock.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.exception.TasksException;
import com.mock.modle.Tasks;
import com.mock.repo.TaskDao;
@Service
public class TaskServiceImpl implements TaskService{
	@Autowired
	private TaskDao dao;
	@Override
	public Tasks registerTasks(Tasks ts) throws TasksException {
		return dao.save(ts);
	}

	@Override
	public Tasks deleteTasksById(Integer tsId) throws TasksException {
		 Optional<Tasks> opt=dao.findById(tsId);
			
			if(opt.isPresent()) {
				
				Tasks exisitingts=opt.get();
				
				dao.delete(exisitingts);
				
				return exisitingts;
			}else {
				throw new TasksException("Tasks does not exist with this tsId "+tsId);
				
			}
	}

	@Override
	public Tasks updateTasks(Tasks ts) throws TasksException {
		 Optional<Tasks> opt=dao.findById(ts.getId());
			
			if(opt.isPresent()) {
				return dao.save(ts);
			}else {
				throw new TasksException("Invalis Tasks details");
			}
	}

}
