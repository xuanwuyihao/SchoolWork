package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserDao {
	public void add(User user);
	public void delete(Integer id);
	public void update(User user);
	public List<User> findAll();
	public User getById(Integer id);

}
