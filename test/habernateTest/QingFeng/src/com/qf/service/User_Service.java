package com.qf.service;

import java.util.List;

import com.qf.model.Academy;
import com.qf.model.User;

public interface User_Service {
	
	public abstract void save(User user);    //保存
	public abstract void update(User user);   //修改
	public abstract void delete(int u_id);      //删除
	public abstract List<User> list();	  //查询全部
	public abstract Academy getUser(int u_id);	//查询单个
	public abstract void remove(Integer[] u_ids);  //批量移除
}
