package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.StillMapper;
import com.p2p.pojo.Fy;
import com.p2p.pojo.Page;
import com.p2p.pojo.Still;
import com.p2p.service.StillService;

@Transactional
@Service

public class StillServiceImpl implements StillService{

	@Resource
	private StillMapper stillMapper;
	@Override
	public List<Still> list() {
		// TODO Auto-generated method stub
		return stillMapper.list();
	}

	@Override
	public void save(Still t) {
		// TODO Auto-generated method stub
		stillMapper.save(t);
	}

	@Override
	public void update(Still t) {
		// TODO Auto-generated method stub
		stillMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		stillMapper.remove(id);
	}

	@Override
	public Still getById(Integer id) {
		// TODO Auto-generated method stub
		return stillMapper.getById(id);
	}

	@Override
	public List<Still> pageList(Fy f) {
		// TODO Auto-generated method stub
		return stillMapper.pageList(f);
	}

	@Override
	public Integer mhStillCount(Fy f) {
		// TODO Auto-generated method stub
		return stillMapper.mhStillCount(f);
	}

	@Override
	public List<Still> mhStillList(Fy f) {
		// TODO Auto-generated method stub
		return stillMapper.mhStillList(f);
	}

	@Override
	public List<Still> list2() {
		// TODO Auto-generated method stub
		return stillMapper.list2();
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return stillMapper.count();
	}

	@Override
	public List<Still> selectlike(Page page) {
		// TODO Auto-generated method stub
		return stillMapper.selectlike(page);
	}

	@Override
	public List<Still> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return stillMapper.selectpeople(page);
	}

	@Override
	public List<Still> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return stillMapper.selectpaging(page);
	}

	@Override
	public List<Still> selSumMoney(String username) {
		// TODO Auto-generated method stub
		return stillMapper.selSumMoney(username);
	}

	@Override
	public List<Still> getStill(String username) {
		// TODO Auto-generated method stub
		return stillMapper.getStill(username);
	}



}
