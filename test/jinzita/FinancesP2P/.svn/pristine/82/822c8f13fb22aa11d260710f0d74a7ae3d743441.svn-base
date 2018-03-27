package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.UserMapper;
import com.p2p.pojo.Page;
import com.p2p.pojo.User;
import com.p2p.pojo.UserInfo;
import com.p2p.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    
	@Resource
	private UserMapper userMapper;
	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userMapper.list();
	}

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		userMapper.save(t);
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		userMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		userMapper.remove(id);
	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.getById(id);
	}

	@Override
	public User selPhone(String phone) {
		// TODO Auto-generated method stub
		return userMapper.selPhone(phone);
	}

	@Override
	public List<User> list2() {
		// TODO Auto-generated method stub
		return userMapper.list2();
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return userMapper.count();
	}



	@Override
	public List<User> selectlike(Page page) {
		// TODO Auto-generated method stub
		return userMapper.selectlike(page);
	}

	@Override
	public List<User> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return userMapper.selectpeople(page);
	}

	@Override
	public List<User> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return userMapper.selectpaging(page);
	}
	
	@Override
	public User getByPhoneName(User user) {
		// TODO Auto-generated method stub
		return userMapper.getByPhoneName(user);
	}


	@Override
	public User getid(String userName) {
		
		return userMapper.getid(userName);
	}


	@Override
	public Integer getPhoneById(int id) {
		// TODO Auto-generated method stub
		return userMapper.getPhoneById(id);
	}

	@Override
	public Integer pcount() {
		// TODO Auto-generated method stub
		return userMapper.pcount();
	}

	
}
