package com.qf.service.impl;

import java.util.List;

import com.qf.dao.Home_content_Dao;
import com.qf.model.Home_content;
import com.qf.service.Home_content_Service;

public class Home_content_ServiceImpl implements Home_content_Service{

	private Home_content_Dao home_content_Dao ;

	
	
	
	
	public Home_content_Dao getHome_content_Dao() {
		return home_content_Dao;
	}

	public void setHome_content_Dao(Home_content_Dao home_content_Dao) {
		this.home_content_Dao = home_content_Dao;
	}

	@Override
	 //保存
	public void save(Home_content home_content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//修改
	public void update(Home_content academy) {
		// TODO Auto-generated method stub
		home_content_Dao.update(academy);
	}

	@Override
	//删除
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//查询全部
	public List<Home_content> list() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	//查询单个
	public Home_content getHome_content(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//批量移除
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}
}
