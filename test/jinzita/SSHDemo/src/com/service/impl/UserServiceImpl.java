package com.service.impl;

import java.util.List;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
			userDao.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
			userDao.update(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
			userDao.delete(id);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return userDao.getCount();
	}

	@Override
	public List<User> getSelect(int firstCount, int total) {
		// TODO Auto-generated method stub
		return userDao.getSelect(firstCount, total);
	}

}
