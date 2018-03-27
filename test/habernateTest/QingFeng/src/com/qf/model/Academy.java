package com.qf.model;

import java.io.Serializable;
/**academy(院校专业表)			
a_id	int(主键)	编号		
a_school	varchar	学校	
a_major	varchar	专业	
a_flag	int	标志位				
*/
public class Academy implements Serializable{
	private Integer a_id;
	private String a_school;
	private String a_major;
	private Integer a_flag;
	
	public Academy(){}
	public Academy(Integer a_id,String a_school,String a_major,Integer a_flag){
		this.a_id=a_id;
		this.a_school=a_school;
		this.a_major=a_major;
		this.a_flag=a_flag;
	}
	public Integer getA_id() {
		return a_id;
	}
	public void setA_id(Integer a_id) {
		this.a_id = a_id;
	}
	public String getA_school() {
		return a_school;
	}
	public void setA_school(String a_school) {
		this.a_school = a_school;
	}
	public String getA_major() {
		return a_major;
	}
	public void setA_major(String a_major) {
		this.a_major = a_major;
	}
	public Integer getA_flag() {
		return a_flag;
	}
	public void setA_flag(Integer a_flag) {
		this.a_flag = a_flag;
	}
	
	
}
