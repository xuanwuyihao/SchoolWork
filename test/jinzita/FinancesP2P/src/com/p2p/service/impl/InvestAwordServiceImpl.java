package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.p2p.mapper.InvestAwordMapper;
import com.p2p.pojo.InvestAword;
import com.p2p.pojo.Investpaging;
import com.p2p.pojo.Investseek;
import com.p2p.pojo.Paging;
import com.p2p.service.InvestAwordService;

@Service
public class InvestAwordServiceImpl implements InvestAwordService{
	
	@Resource
	private InvestAwordMapper investAwordMapper;

	@Override
	public List<InvestAword> list() {
		// TODO Auto-generated method stub
		return investAwordMapper.list();
	}

	@Override
	public void save(InvestAword t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(InvestAword t) {
		// TODO Auto-generated method stub
		
		investAwordMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InvestAword getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvestAword> seek(Investseek seek) {
		// TODO Auto-generated method stub
		return investAwordMapper.seek(seek);
	}

	@Override
	public List<InvestAword> selpaging(Paging p) {
		// TODO Auto-generated method stub
		return investAwordMapper.selpaging(p);
	}

	@Override
	public List<InvestAword> investpaging(Investpaging ip) {
		// TODO Auto-generated method stub
		return investAwordMapper.investpaging(ip);
	}

	

}
