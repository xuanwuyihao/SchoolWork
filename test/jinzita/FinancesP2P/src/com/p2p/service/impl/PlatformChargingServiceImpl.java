package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.p2p.mapper.PlatformChargingMapper;
import com.p2p.pojo.PlatformCharging;
import com.p2p.service.PlatformChargingService;

@Service
public class PlatformChargingServiceImpl implements PlatformChargingService{

	@Resource
	PlatformChargingMapper platformChargingMapper;
	
	@Override
	public List<PlatformCharging> list() {
		// TODO Auto-generated method stub
		return platformChargingMapper.list();
	}

	@Override
	public void save(PlatformCharging t) {
		// TODO Auto-generated method stub
		platformChargingMapper.save(t);
	}

	@Override
	public void update(PlatformCharging t) {
		// TODO Auto-generated method stub
		platformChargingMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		platformChargingMapper.remove(id);
	}

	@Override
	public PlatformCharging getById(Integer id) {
		// TODO Auto-generated method stub
		return platformChargingMapper.getById(id);
	}

	@Override
	public Integer maxCount() {
		// TODO Auto-generated method stub
		return platformChargingMapper.maxCount();
	}

}
