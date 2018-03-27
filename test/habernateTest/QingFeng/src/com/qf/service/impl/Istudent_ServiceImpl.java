package com.qf.service.impl;

import java.util.List;

import com.qf.dao.Student_Dao;
import com.qf.dao.impl.Istudent_DaoImpl;
import com.qf.model.Student;
import com.qf.service.Student_Service;


/**
 * @author 
 *
 *Student_ServiceImpl
 */
public class Istudent_ServiceImpl implements Student_Service{
	
	private Student_Dao student_Dao;
	
	public Student_Dao getStudent_Dao() {
		return student_Dao;
	}

	public void setStudent_Dao(Student_Dao student_Dao) {
		this.student_Dao = student_Dao;
	}

	//保存
	public void save(Student stu) {
		// TODO Auto-generated method stub
		student_Dao.save(stu);
	}

	//修改
	@Override
	public void update(Student stu) {
		// TODO Auto-generated method stub
		student_Dao.update(stu);
		
	}

	//删除单个
	@Override
	public void delete(int s_id) {
		// TODO Auto-generated method stub
		student_Dao.delete(s_id);
		
	}

	//查询所有数据
	@Override
	public List<Student> stu_list() {
		return student_Dao.stu_list();
	}

	//查询单个
	@Override
	public Student getStudent(int s_id) {
		// TODO Auto-generated method stub
		return student_Dao.getStudent(s_id);
	}

	//批量移除
	@Override
	public void remove_Students(Integer[] s_ids) {
		// TODO Auto-generated method stub
		student_Dao.remove_Students(s_ids);
		
	}
	
}
