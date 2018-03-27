package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.ThawMapper;
import com.ht.model.Thaw;
import com.ht.service.ThawService;

@Transactional
@Service
public class ThawServiceImpl implements ThawService{

	@Resource
	private ThawMapper thawMapper;
	
	
	@Override
	public List<Thaw> list() {
		// TODO Auto-generated method stub
		return thawMapper.list();
	}

	@Override
	public Thaw getById(Integer id) {
		// TODO Auto-generated method stub
		return thawMapper.getById(id);
	}

	@Override
	public void insert(Thaw t) {
		// TODO Auto-generated method stub
		thawMapper.insert(t);
	}

	@Override
	public void update(Thaw t) {
		// TODO Auto-generated method stub
		thawMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		thawMapper.delete(id);
	}

	@Override
	public Integer getThawMaxId() {
		// TODO Auto-generated method stub
		return thawMapper.getThawMaxId();
	}

}
