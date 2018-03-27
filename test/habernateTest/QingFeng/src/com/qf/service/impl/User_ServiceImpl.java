package com.qf.service.impl;

import java.util.List;

import com.qf.dao.User_Dao;
import com.qf.model.Academy;
import com.qf.model.User;
import com.qf.service.User_Service;

public class User_ServiceImpl implements User_Service{
	
	private User_Dao user_Dao;

	public User_Dao getUser_Dao() {
		return user_Dao;
	}

	public void setUser_Dao(User_Dao user_Dao) {
		this.user_Dao = user_Dao;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int u_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Academy getUser(int u_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] u_ids) {
		// TODO Auto-generated method stub
		
	}
	
}
