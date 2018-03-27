package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.UsersMapper;
import com.ht.model.Users;
import com.ht.service.UsersService;

@Transactional
@Service
public class UsersServiceImpl implements UsersService{

	@Resource
	private UsersMapper usersMapper;
	
	@Override
	public List<Users> list() {
		// TODO Auto-generated method stub
		return usersMapper.list();
	}

	@Override
	public Users getById(Integer id) {
		// TODO Auto-generated method stub
		return usersMapper.getById(id);
	}

	@Override
	public void insert(Users t) {
		// TODO Auto-generated method stub
		usersMapper.insert(t);
	}

	@Override
	public void update(Users t) {
		// TODO Auto-generated method stub
		usersMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		usersMapper.delete(id);
	}

	@Override
	public Users getByPhone(String userphone) {
		// TODO Auto-generated method stub
		return usersMapper.getByPhone(userphone);
	}

}
