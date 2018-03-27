package com.qf.service.impl;


import java.util.Map;

import com.qf.dao.Academy_Dao;
import com.qf.model.Academy;
import com.qf.service.Academy_Service;

public class Iacademy_ServiceImpl  implements Academy_Service{
	
	private Academy_Dao academy_Dao;

	public Academy_Dao getAcademy_Dao() {
		return academy_Dao;
	}

	public void setAcademy_Dao(Academy_Dao academy_Dao) {
		this.academy_Dao = academy_Dao;
	}

	@Override
	public void save(Academy academy) {
		// TODO Auto-generated method stub
		academy_Dao.save(academy);
		
	}

	@Override
	public void update(Academy academy) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	
	public Map<String ,Object> list() {
		// TODO Auto-generated method stub
		
		return academy_Dao.list();
	}

	@Override
	public Academy getAcademy(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}

}
