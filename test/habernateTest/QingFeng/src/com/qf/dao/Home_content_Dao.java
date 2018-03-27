package com.qf.dao;

import java.util.List;

import com.qf.model.Academy;
import com.qf.model.Home_content;

public interface Home_content_Dao {

	public abstract void save(Home_content home_content);    //保存
	public abstract void update(Home_content academy);   //修改
	public abstract void delete(int a_id);      //删除
	public abstract List<Home_content> list();	  //查询全部
	public abstract Home_content getHome_content(int a_id);	//查询单个
	public abstract void remove(Integer[] a_ids);  //批量移除
}
