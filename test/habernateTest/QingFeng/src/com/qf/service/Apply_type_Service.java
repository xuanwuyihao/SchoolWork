package com.qf.service;

import java.util.List;

import com.qf.model.Apply_type;

public interface Apply_type_Service {

	public abstract void save(Apply_type apply_type);    //保存
	public abstract void update(Apply_type apply_type);   //修改
	public abstract void delete(int at_id);      //删除
	public abstract List<Apply_type> list();	  //查询全部
	public abstract Apply_type getApply_type(int a_id);	//查询单个
	public abstract void remove(Integer[] at_ids);  //批量移除
}
