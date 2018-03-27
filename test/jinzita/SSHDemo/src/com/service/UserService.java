package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	public abstract void add(User user);
	public abstract void update(User user);
	public abstract void delete(int id);
	public abstract List<User> list();
	public abstract int getCount();
	public abstract List<User> getSelect(int firstCount,int total);


}
