package com.qf.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class Student  implements Serializable{
	
	private Integer s_id; 			//编号      
	private String  s_studentno;	//学号
	private String  s_name;			//姓名
	private String  user_id;		//(关联系统用户表id)
	private String  id_number;		//身份证号
	private String  s_phone;		//联系电话
	private String  s_content;		//学习内容
	private String  academy_id;		//报考院校	关联院校表id
	private String  s_gradations;	//报考层次(高达专、专升本、高达本)
	private String  s_systme;		//学制
	private String  s_date;			//报考日期
	private Integer s_type;			//报名类型

	
	
	
	
	//构造函数
	public Student(Integer s_id, String s_studentno, String s_name, String user_id, String id_number, String s_phone,
			String s_content, String academy_id, String s_gradations, String s_systme, String s_date, Integer s_type) {

		this.s_id = s_id;
		this.id_number = id_number;
		this.s_studentno = s_studentno;
		this.s_name = s_name;
		this.user_id = user_id;
		this.s_phone = s_phone;
		this.s_systme = s_systme;
		this.s_type = s_type;
		this.s_content = s_content;
		this.academy_id = academy_id;
		this.s_gradations = s_gradations;
		this.s_date = s_date; 
	}	


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getS_id() {
		return s_id;
	}
	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}
	public String getS_studentno() {
		return s_studentno;
	}
	public void setS_studentno(String s_studentno) {
		this.s_studentno = s_studentno;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getS_phone() {
		return s_phone;
	}
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	public String getS_content() {
		return s_content;
	}
	public void setS_content(String s_content) {
		this.s_content = s_content;
	}
	public String getAcademy_id() {
		return academy_id;
	}
	public void setAcademy_id(String academy_id) {
		this.academy_id = academy_id;
	}
	public String getS_gradations() {
		return s_gradations;
	}
	public void setS_gradations(String s_gradations) {
		this.s_gradations = s_gradations;
	}
	public String getS_systme() {
		return s_systme;
	}
	public void setS_systme(String s_systme) {
		this.s_systme = s_systme;
	}
	public String getS_date() {
		return s_date;
	}
	public void setS_date(String s_date) {
		this.s_date = s_date;
	}
	public Integer getS_type() {
		return s_type;
	}
	public void setS_type(Integer s_type) {
		this.s_type = s_type;
	}

	
				
				
				
				
				
				
				
			
				
				
				
				
				


}
