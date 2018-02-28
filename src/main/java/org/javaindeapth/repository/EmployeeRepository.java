package org.javaindeapth.repository;

import java.util.HashMap;
import java.util.Map;

import org.javaindeapth.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	private Map<Integer,Employee> map = new HashMap<Integer,Employee>();
	
	public void addEmployee(Employee e) {
		map.put(e.getId(), e);
	}
	
	public Employee removeEmployee(Employee e) {
		return map.remove(e.getId());
	}
	
	public Employee updateEmployee(Employee e) {
		return map.put(e.getId(),e);
	}

}
