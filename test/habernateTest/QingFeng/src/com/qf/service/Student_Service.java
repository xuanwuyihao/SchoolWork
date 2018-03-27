package com.qf.service;

import java.util.List;

import com.qf.model.Student;

public interface Student_Service {
	
	public abstract void save(Student stu);    //保存学生信息
	public abstract void update(Student stu);   //修改
	public abstract void delete(int s_id);      //删除
	public abstract List<Student> stu_list();	  //查询全部
	public abstract Student getStudent(int s_id);	//查询单个
	public abstract void remove_Students(Integer[] s_ids);  //批量移除数据
	
	
}
