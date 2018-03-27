package com.qf.service.impl;

import java.util.List;

import com.qf.dao.Academy_Dao;
import com.qf.dao.Apply_type_Dao;
import com.qf.model.Apply_type;
import com.qf.service.Apply_type_Service;

public class Apply_type_ServiceImpl implements Apply_type_Service{

	private Apply_type_Dao apply_type_Dao;
	


	public Apply_type_Dao getApply_type_Dao() {
		return apply_type_Dao;
	}

	public void setApply_type_Dao(Apply_type_Dao apply_type_Dao) {
		this.apply_type_Dao = apply_type_Dao;
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
