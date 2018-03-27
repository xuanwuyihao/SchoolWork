package demo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Post implements Serializable{
	private Integer id;
	private String name;
	private Set<Department> department = new HashSet<>();
	public Post(){}
	public Post(Integer id,String name){
		this.id = id;
		this.name = name;
	}
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
	public Set<Department> getDepartment() {
		return department;
	}
	public void setDepartment(Set<Department> department) {
		this.department = department;
	}
	
	

}
