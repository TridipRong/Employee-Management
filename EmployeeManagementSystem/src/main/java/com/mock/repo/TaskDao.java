package com.mock.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mock.modle.Tasks;

public interface TaskDao  extends JpaRepository<Tasks, Integer>{
	//public Optional<Task> findById(Integer id);
}
