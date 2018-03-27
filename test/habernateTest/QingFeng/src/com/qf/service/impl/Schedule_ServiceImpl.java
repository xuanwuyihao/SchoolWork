package com.qf.service.impl;

import java.util.List;

import com.qf.dao.Schedule_Dao;
import com.qf.model.Schedule;
import com.qf.service.Schedule_Service;

public class Schedule_ServiceImpl implements Schedule_Service{

	private Schedule_Dao schedule_Dao;

	public Schedule_Dao getSchedule_Dao() {
		return schedule_Dao;
	}

	public void setSchedule_Dao(Schedule_Dao schedule_Dao) {
		this.schedule_Dao = schedule_Dao;
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
