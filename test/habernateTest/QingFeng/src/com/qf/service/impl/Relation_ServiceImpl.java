package com.qf.service.impl;

import java.util.List;

import com.qf.dao.Relation_Dao;
import com.qf.model.Relation;
import com.qf.service.Relation_Service;

public class Relation_ServiceImpl implements Relation_Service{

	private Relation_Dao relation_Dao;

	
	
	public Relation_Dao getRelation_Dao() {
		return relation_Dao;
	}

	public void setRelation_Dao(Relation_Dao relation_Dao) {
		this.relation_Dao = relation_Dao;
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
