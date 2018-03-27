package com.qf.service.impl;

import java.util.List;

import com.qf.dao.Finance_Dao;
import com.qf.model.Finance;
import com.qf.service.Finance_Service;

public class Finance_ServiceImpl implements Finance_Service{

	private Finance_Dao finance_Dao;

	public Finance_Dao getFinance_Dao() {
		return finance_Dao;
	}

	public void setFinance_Dao(Finance_Dao finance_Dao) {
		this.finance_Dao = finance_Dao;
	}

	@Override
	public void save(Finance finance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Finance finance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Finance> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Finance getAcademy(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}
	
	
}
