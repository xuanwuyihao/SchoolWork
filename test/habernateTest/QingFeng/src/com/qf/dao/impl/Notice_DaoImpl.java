package com.qf.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.qf.dao.Notice_Dao;
import com.qf.model.Notice;

public class Notice_DaoImpl implements Notice_Dao{

	
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Notice notice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Notice notice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Notice> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getNotice(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}

}
