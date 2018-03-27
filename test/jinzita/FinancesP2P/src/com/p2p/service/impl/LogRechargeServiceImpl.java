package com.p2p.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.LogRechargeMapper;
import com.p2p.pojo.LogRecharge;
import com.p2p.pojo.Page;
import com.p2p.pojo.User;
import com.p2p.service.LogRechargeService;

@Transactional
@Service
public class LogRechargeServiceImpl implements LogRechargeService{

	@Resource
	private LogRechargeMapper logRechargeMapper;
	
	@Override
	public List<LogRecharge> list() {
		// TODO Auto-generated method stub
		return logRechargeMapper.list();
	}

	@Override
	public void save(LogRecharge t) {
		// TODO Auto-generated method stub
		logRechargeMapper.save(t);
	}

	@Override
	public void update(LogRecharge t) {
		// TODO Auto-generated method stub
		logRechargeMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		logRechargeMapper.remove(id);
	}

	@Override
	public LogRecharge getById(Integer id) {
		// TODO Auto-generated method stub
		return logRechargeMapper.getById(id);
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return logRechargeMapper.count();
	}

	@Override
	public List<LogRecharge> selectlike(Page page) {
		// TODO Auto-generated method stub
		return logRechargeMapper.selectlike(page);
	}

	@Override
	public List<LogRecharge> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return logRechargeMapper.selectpeople(page);
	}

	@Override
	public List<LogRecharge> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return logRechargeMapper.selectpaging(page);
	}

	@Override
	public List<LogRecharge> selPhone(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return logRechargeMapper.selPhone(map);
	}

	@Override
	public LogRecharge maxRecharge(String phone) {
		// TODO Auto-generated method stub
		return logRechargeMapper.maxRecharge(phone);
	}

	@Override
	public Integer rechargeCount(String phone) {
		// TODO Auto-generated method stub
		return logRechargeMapper.rechargeCount(phone);
	}

	

}
