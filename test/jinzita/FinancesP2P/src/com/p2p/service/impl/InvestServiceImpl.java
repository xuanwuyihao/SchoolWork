package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.InvestMapper;
import com.p2p.pojo.Fy;
import com.p2p.pojo.Invest;
import com.p2p.service.InvestService;

@Transactional
@Service
public class InvestServiceImpl implements InvestService{

	
	@Resource
	private InvestMapper investMapper;
	
	@Override
	public List<Invest> list() {
		// TODO Auto-generated method stub
		return investMapper.list();
	}

	@Override
	public void save(Invest t) {
		// TODO Auto-generated method stub
		investMapper.save(t);
	}

	@Override
	public void update(Invest t) {
		// TODO Auto-generated method stub
		investMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		investMapper.remove(id);
	}

	@Override
	public Invest getById(Integer id) {
		// TODO Auto-generated method stub
		return investMapper.getById(id);
	}

	@Override
	public Integer getInvestCountBybid(String bid) {
		// TODO Auto-generated method stub
		return investMapper.getInvestCountBybid(bid);
	}

	@Override
	public List<Invest> getInvestBybid(String bid) {
		// TODO Auto-generated method stub
		return investMapper.getInvestBybid(bid);
	}

	@Override
	public List<Invest> getFyInvestBybid(Fy f) {
		// TODO Auto-generated method stub
		return investMapper.getFyInvestBybid(f);
	}

	@Override
	public void updateInvestStatus(Invest ie) {
		// TODO Auto-generated method stub
		investMapper.updateInvestStatus(ie);
	}

	@Override
	public Integer getCount() {
		// TODO Auto-generated method stub
		return investMapper.getCount();
	}

	@Override
	public List<Invest> selectInvestByBillcode(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float selAllMoney() {
		// TODO Auto-generated method stub
		return null;
	}

}
