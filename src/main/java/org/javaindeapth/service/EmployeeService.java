package org.javaindeapth.service;

import org.javaindeapth.entity.Employee;
import org.javaindeapth.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	public void addEmployee(Employee e) {
		repository.addEmployee(e);
	}
	
	public Employee removeEmployee(Employee e) {
		return repository.removeEmployee(e);
	}
	
	public Employee updateEmployee(Employee e) {
		return repository.updateEmployee(e);
	}
}
