package Demo;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private Integer id;
	private String sex;
	private Integer age;
	
	public Student(){}
	public Student(String name,Integer id,String sex,Integer age){
		this.age=age;
		this.name=name;
		this.id=id;
		this.sex=sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
