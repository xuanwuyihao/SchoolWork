package com.p2p.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.LogLiftMapper;
import com.p2p.pojo.LogLift;
import com.p2p.pojo.Page;
import com.p2p.service.LogLiftService;

@Transactional
@Service
public class LogLiftServiceImpl implements LogLiftService{

	@Resource
	private LogLiftMapper logLiftMapper;
	
	@Override
	public List<LogLift> list() {
		// TODO Auto-generated method stub
		return logLiftMapper.list();
	}

	@Override
	public void save(LogLift t) {
		// TODO Auto-generated method stub
		logLiftMapper.save(t);
	}

	@Override
	public void update(LogLift t) {
		// TODO Auto-generated method stub
		logLiftMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		logLiftMapper.remove(id);
	}

	@Override
	public LogLift getById(Integer id) {
		// TODO Auto-generated method stub
		return logLiftMapper.getById(id);
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return logLiftMapper.count();
	}

	@Override
	public List<LogLift> selectlike(Page page) {
		// TODO Auto-generated method stub
		return logLiftMapper.selectlike(page);
	}

	@Override
	public List<LogLift> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return logLiftMapper.selectpeople(page);
	}

	@Override
	public List<LogLift> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return logLiftMapper.selectpaging(page);
	}


	@Override
	public Integer rechargeCount(String username) {
		// TODO Auto-generated method stub
		return logLiftMapper.rechargeCount(username);
	}

	@Override
	public List<LogLift> selPhone(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return logLiftMapper.selPhone(map);
	}

}
