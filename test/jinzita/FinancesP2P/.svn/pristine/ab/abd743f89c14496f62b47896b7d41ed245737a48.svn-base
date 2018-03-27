package com.p2p.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.LogMoneyMapper;
import com.p2p.pojo.LogMoney;
import com.p2p.pojo.Page;
import com.p2p.service.LogMoneyService;

@Transactional
@Service
public class LogMoneyServiceImpl implements LogMoneyService {

	@Resource
	private LogMoneyMapper logMoneyMapper;
	
	@Override
	public List<LogMoney> list() {
		// TODO Auto-generated method stub
		return logMoneyMapper.list();
	}

	@Override
	public void save(LogMoney t) {
		// TODO Auto-generated method stub
		logMoneyMapper.save(t);
	}

	@Override
	public void update(LogMoney t) {
		// TODO Auto-generated method stub
		logMoneyMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		logMoneyMapper.remove(id);
	}

	@Override
	public LogMoney getById(Integer id) {
		// TODO Auto-generated method stub
		return logMoneyMapper.getById(id);
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return logMoneyMapper.count();
	}

	@Override
	public List<LogMoney> selectlike(Page page) {
		// TODO Auto-generated method stub
		return logMoneyMapper.selectlike(page);
	}

	@Override
	public List<LogMoney> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return logMoneyMapper.selectpeople(page);
	}

	@Override
	public List<LogMoney> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return logMoneyMapper.selectpaging(page);
	}

	@Override
	public List<LogMoney> selPhone(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return logMoneyMapper.selPhone(map);
	}

	
}
