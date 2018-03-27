package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	

	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

}
