package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.p2p.mapper.SysLogMapper;
import com.p2p.pojo.SysLog;
import com.p2p.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService{

	@Resource
	private SysLogMapper sysLogMapper; 
	
	@Override
	public List<SysLog> list() {
		// TODO Auto-generated method stub
		return sysLogMapper.list();
	}

	@Override
	public void save(SysLog t) {
		// TODO Auto-generated method stub
		sysLogMapper.save(t);
	}

	@Override
	public void update(SysLog t) {
		// TODO Auto-generated method stub
		sysLogMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		sysLogMapper.remove(id);
	}

	@Override
	public SysLog getById(Integer id) {
		// TODO Auto-generated method stub
		return sysLogMapper.getById(id);
	}

	@Override
	public Integer maxCount() {
		// TODO Auto-generated method stub
		return sysLogMapper.maxCount();
	}

}
