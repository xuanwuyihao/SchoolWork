package com.qf.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.qf.dao.Apply_type_Dao;
import com.qf.model.Apply_type;

public class Apply_type_DaoImpl implements Apply_type_Dao{

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Apply_type apply_type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Apply_type apply_type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int at_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Apply_type> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Apply_type getApply_type(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] at_ids) {
		// TODO Auto-generated method stub
		
	}

}
