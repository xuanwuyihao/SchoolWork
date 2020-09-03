package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	public void add(User user);
	public void delete(Integer id);
	public void update(User user);
	public List<User> findAll();

}