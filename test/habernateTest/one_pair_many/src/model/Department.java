package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Department implements Serializable{

	private Integer id;
	private String name;
	private Set<Employee> employee=new HashSet<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
}
