package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.FrozeMapper;
import com.ht.model.Froze;
import com.ht.service.FrozeService;

@Transactional
@Service
public class FrozeServiceImpl implements FrozeService{

	@Resource
	private FrozeMapper frozeMapper;
	
	
	@Override
	public List<Froze> list() {
		// TODO Auto-generated method stub
		return frozeMapper.list();
	}

	@Override
	public Froze getById(Integer id) {
		// TODO Auto-generated method stub
		return frozeMapper.getById(id);
	}

	@Override
	public void insert(Froze t) {
		// TODO Auto-generated method stub
		frozeMapper.insert(t);
	}

	@Override
	public void update(Froze t) {
		// TODO Auto-generated method stub
		frozeMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		frozeMapper.delete(id);
	}

	@Override
	public Integer getFrozeMaxId() {
		// TODO Auto-generated method stub
		return frozeMapper.getFrozeMaxId();
	}

	@Override
	public List<Froze> getFrozeThaw(Froze f) {
		// TODO Auto-generated method stub
		return frozeMapper.getFrozeThaw(f);
	}

}
