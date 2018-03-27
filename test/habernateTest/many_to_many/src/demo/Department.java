package demo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Department implements Serializable{
	private Integer id;
	private String name;
	private Set<Post> post = new HashSet<>();
	public Department(){}
	public Department(Integer id,String name){
		this.id = id;
		this.name = name;
	}
	
	public Set<Post> getPost() {
		return post;
	}
	public void setPost(Set<Post> post) {
		this.post = post;
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
	

}
