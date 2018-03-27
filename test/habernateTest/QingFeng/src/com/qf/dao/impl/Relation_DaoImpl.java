package com.qf.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.qf.dao.Relation_Dao;
import com.qf.model.Relation;

public class Relation_DaoImpl implements Relation_Dao{

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Relation relation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Relation relation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Relation> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Relation getRelation(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}
}
