package com.qf.service;

import java.util.List;

import com.qf.model.Schedule;

public interface Schedule_Service {

	public abstract void save(Schedule schedule);    //保存
	public abstract void update(Schedule schedule);   //修改
	public abstract void delete(int a_id);      //删除
	public abstract List<Schedule> list();	  //查询全部
	public abstract Schedule getSchedule(int a_id);	//查询单个
	public abstract void remove(Integer[] a_ids);  //批量移除
}
