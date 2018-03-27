package com.qf.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.qf.dao.Home_content_Dao;
import com.qf.model.Home_content;

public class Home_content_DaoImpl implements Home_content_Dao{

	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Home_content home_content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Home_content academy) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(academy);
	}

	@Override
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Home_content> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Home_content getHome_content(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}

}
