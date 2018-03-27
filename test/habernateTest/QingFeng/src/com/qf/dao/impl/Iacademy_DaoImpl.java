package com.qf.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.qf.dao.Academy_Dao;
import com.qf.model.Academy;

public class Iacademy_DaoImpl implements Academy_Dao{

	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Academy academy) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(academy);
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
	public Academy getAcademy(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> list() {
		List<Academy> list = hibernateTemplate.find("from Academy");
		Map jsonMap = new HashMap();
		jsonMap.put("rows", list);  //rows  total  ·ÖÒ³
		jsonMap.put("total", 20);
		return jsonMap;
	}

}
