package com.qf.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionSupport;
import com.qf.model.Student;
import com.qf.service.Student_Service;
import com.qf.service.impl.Istudent_ServiceImpl;
/**
 * 
 * @author Administrator
 *
 *学生Action
 *
 */
public class Student_Action  extends ActionSupport{
	
	private Student_Service student_Service;
	private List list;
	private Student student;
	private Integer s_id;
	private Integer[]  s_ids;
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	
	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}

	public Integer[] getS_ids() {
		return s_ids;
	}

	public void setS_ids(Integer[] s_ids) {
		this.s_ids = s_ids;
	}


	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}




	public Student_Service getStudent_Service() {
		return student_Service;
	}

	public void setStudent_Service(Student_Service student_Service) {
		this.student_Service = student_Service;
	}

	//查询所有数据
	public String list(){
		list =student_Service.stu_list();
		return SUCCESS;
	}
	
	//增加
	public String save(){
		student_Service.save(student);
		return SUCCESS;
	}
	
	//删除
	public String delete(){
		student_Service.delete(s_id);
		return SUCCESS;
	}
	
	//查询单个数据
	public String sel_Studnet(){
		student_Service.getStudent(s_id);
		return SUCCESS;
	}
	
	//修改
	public String update(){
		student_Service.update(student);
		return SUCCESS;
	}
	
	//批量删除
	public String remove(){
		student_Service.remove_Students(s_ids);
		return SUCCESS;
	}
	
	

}
