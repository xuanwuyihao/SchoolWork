package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.p2p.mapper.JurisdictionMapper;
import com.p2p.pojo.Jurisdiction;
import com.p2p.service.JurisdictionService;

@Controller
@Service
public class JurisdictionServiceImpl implements JurisdictionService{

	@Resource
	private JurisdictionMapper jurisdictionMapper;
	@Override
	public List<Jurisdiction> list() {
		// TODO Auto-generated method stub
		return jurisdictionMapper.list();
	}

	@Override
	public void save(Jurisdiction t) {
		// TODO Auto-generated method stub
		jurisdictionMapper.save(t);
	}

	@Override
	public void update(Jurisdiction t) {
		// TODO Auto-generated method stub
		jurisdictionMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		jurisdictionMapper.remove(id);
	}

	@Override
	public Jurisdiction getById(Integer id) {
		// TODO Auto-generated method stub
		return jurisdictionMapper.getById(id);
	}

	@Override
	public List<Jurisdiction> getRolejur(String str) {
		// TODO Auto-generated method stub
		return jurisdictionMapper.getRolejur(str);
	}

}
