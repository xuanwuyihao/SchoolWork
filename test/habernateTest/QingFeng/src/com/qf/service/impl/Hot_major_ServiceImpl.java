package com.qf.service.impl;

import java.util.List;

import com.qf.dao.Hot_major_Dao;
import com.qf.model.Hot_major;
import com.qf.service.Hot_major_Service;

public class Hot_major_ServiceImpl implements Hot_major_Service{

	private Hot_major_Dao hot_major_Dao;
	
	
	
	public Hot_major_Dao getHot_major_Dao() {
		return hot_major_Dao;
	}

	public void setHot_major_Dao(Hot_major_Dao hot_major_Dao) {
		this.hot_major_Dao = hot_major_Dao;
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
