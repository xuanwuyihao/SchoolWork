package com.qf.service;

import java.util.List;


import com.qf.model.Finance;

public interface Finance_Service {

	public abstract void save(Finance finance);    //保存
	public abstract void update(Finance finance);   //修改
	public abstract void delete(int a_id);      //删除
	public abstract List<Finance> list();	  //查询全部
	public abstract Finance getAcademy(int a_id);	//查询单个
	public abstract void remove(Integer[] a_ids);  //批量移除
}
