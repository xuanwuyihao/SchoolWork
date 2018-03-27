package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.StayStillMapper;
import com.p2p.pojo.Page;
import com.p2p.pojo.StayStill;
import com.p2p.service.StayStillService;

@Transactional
@Service
public class StayStillServiceImpl implements StayStillService{

	@Resource
	private StayStillMapper stayStillMapper;
	@Override
	public List<StayStill> list() {
		// TODO Auto-generated method stub
		return stayStillMapper.list();
	}

	@Override
	public void save(StayStill t) {
		// TODO Auto-generated method stub
		stayStillMapper.save(t);
	}

	@Override
	public void update(StayStill t) {
		// TODO Auto-generated method stub
		stayStillMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		stayStillMapper.remove(id);
	}

	@Override
	public StayStill getById(Integer id) {
		// TODO Auto-generated method stub
		return stayStillMapper.getById(id);
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return stayStillMapper.count();
	}

	@Override
	public List<StayStill> selectlike(Page page) {
		// TODO Auto-generated method stub
		return stayStillMapper.selectlike(page);
	}

	@Override
	public List<StayStill> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return stayStillMapper.selectpeople(page);
	}

	@Override
	public List<StayStill> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return stayStillMapper.selectpaging(page);
	}

	@Override
	public void updateDescription(StayStill stayStill) {
		// TODO Auto-generated method stub
		stayStillMapper.updateDescription(stayStill);
	}

}
