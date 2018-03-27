package com.qf.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.qf.dao.Student_Dao;
import com.qf.model.Student;


public class Istudent_DaoImpl implements Student_Dao{
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

		//保存
		public void save(Student stu) {
			// TODO Auto-generated method stub
			hibernateTemplate.save(stu);
		}

		//修改
		@Override
		public void update(Student stu) {
			// TODO Auto-generated method stub
			hibernateTemplate.update(stu);
			
		}

		//删除单个
		@Override
		public void delete(int s_id) {
			// TODO Auto-generated method stub
			Student student = hibernateTemplate.get(Student.class, s_id);
			hibernateTemplate.delete(student);
			
		}

	
		//查询单个
		@Override
		public Student getStudent(int s_id) {
			// TODO Auto-generated method stub
			return hibernateTemplate.get(Student.class, s_id);
		}

		//批量移除
		@Override
		public void remove_Students(Integer[] s_ids) {
			// TODO Auto-generated method stub
			for (int i = 0; i < s_ids.length; i++) {
				int j = s_ids[i];
				hibernateTemplate.delete(hibernateTemplate.get(Student.class, j));
			}
			
			
		}
	@Override
	public List<Student> stu_list() {
		
		return hibernateTemplate.find("from Student");
	}

	

}
