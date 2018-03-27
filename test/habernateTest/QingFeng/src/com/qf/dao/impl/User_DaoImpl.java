package com.qf.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.qf.dao.User_Dao;
import com.qf.model.Academy;
import com.qf.model.User;

public class User_DaoImpl implements User_Dao{
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int u_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Academy getUser(int u_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] u_ids) {
		// TODO Auto-generated method stub
		
	}

}
