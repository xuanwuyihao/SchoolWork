package com.qf.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.qf.dao.Schedule_Dao;
import com.qf.model.Schedule;

public class Schedule_DaoImpl implements Schedule_Dao{

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Schedule schedule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Schedule schedule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Schedule> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule getSchedule(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}
	
}
