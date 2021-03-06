package org.javaindeapth.entity;

import org.springframework.stereotype.Component;
//Bean Class
@Component(value="e2")
public class Employee {
	
	private int id;
	
	private String name;
	
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
