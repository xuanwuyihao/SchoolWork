package com.qf.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.qf.dao.Stu_file_Dao;
import com.qf.model.Stu_file;

public class Stu_file_DaoImpl implements Stu_file_Dao{

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Stu_file stu_file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Stu_file stu_file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Stu_file> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stu_file getStu_file(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}
	
}
