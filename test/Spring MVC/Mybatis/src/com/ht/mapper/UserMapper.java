package com.ht.mapper;

import java.util.List;

import com.bean.User;

public interface UserMapper {
	//新增用户
	public void insertUser(User user);
	//根据id查询
	public void getUser(User user);
	//查询全部
	public List<User> selectAllUssers();
}
