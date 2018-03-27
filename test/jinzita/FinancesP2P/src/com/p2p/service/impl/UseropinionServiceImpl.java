package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.UserOpinionMapper;
import com.p2p.pojo.LendApply;
import com.p2p.pojo.Page;
import com.p2p.pojo.UserOpinion;
import com.p2p.service.UseropinionService;

@Transactional
@Service
public class UseropinionServiceImpl implements UseropinionService{
	@Resource
	private UserOpinionMapper user;
	
	@Override
	public List<UserOpinion> list() {
		// TODO Auto-generated method stub
		return user.list();
	}

	@Override
	public void save(UserOpinion t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserOpinion t) {
		// TODO Auto-generated method stub
		user.update(t);	
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		user.remove(id);
	}

	@Override
	public UserOpinion getById(Integer id) {
		// TODO Auto-generated method stub
		return user.getById(id);
	}

	@Override
	public List<UserOpinion> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return user.selectpaging(page);
	}

	@Override
	public List<UserOpinion> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return user.selectpeople(page);
	}

	@Override
	public List<UserOpinion> selectlike(Page page) {
		// TODO Auto-generated method stub
		return user.selectlike(page);
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return user.count();
	}

	@Override
	public List<UserOpinion> insert(UserOpinion uop) {
		// TODO Auto-generated method stub
		return user.insert(uop);
	}

}
