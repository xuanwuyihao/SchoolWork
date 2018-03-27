package com.qf.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.qf.dao.Hot_major_Dao;
import com.qf.model.Hot_major;

public class Hot_major_DaoImpl implements Hot_major_Dao{

	private HibernateTemplate hibernateTemplate;
	


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Hot_major hot_major) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Hot_major hot_major) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Hot_major> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hot_major getHot_major(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}

}
