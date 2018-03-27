package com.p2p.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.UserRecommendMapper;
import com.p2p.pojo.Page;
import com.p2p.pojo.UserRecommend;
import com.p2p.service.UserRecommendService;

@Transactional
@Service
public class UserRecommendServiceImpl implements UserRecommendService {

	@Resource
	private UserRecommendMapper userRecommendMapper;
	
	@Override
	public List<UserRecommend> list() {
		// TODO Auto-generated method stub
		return userRecommendMapper.list();
	}

	@Override
	public void save(UserRecommend t) {
		// TODO Auto-generated method stub
		userRecommendMapper.save(t);
	}

	@Override
	public void update(UserRecommend t) {
		// TODO Auto-generated method stub
		userRecommendMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		userRecommendMapper.remove(id);
	}

	@Override
	public UserRecommend getById(Integer id) {
		// TODO Auto-generated method stub
		return userRecommendMapper.getById(id);
	}

	@Override
	public List<UserRecommend> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return userRecommendMapper.selectpaging(page);
	}

	@Override
	public List<UserRecommend> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return userRecommendMapper.selectpeople(page);
	}

	@Override
	public List<UserRecommend> selectlike(Page page) {
		// TODO Auto-generated method stub
		return userRecommendMapper.selectlike(page);
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return userRecommendMapper.count();
	}

	@Override
	public List<UserRecommend> selCode(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userRecommendMapper.selCode(map);
	}

}
