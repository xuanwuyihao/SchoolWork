package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.CompanyMoneyMapper;
import com.p2p.pojo.CompanyMoney;
import com.p2p.service.CompanyMoneyService;

@Transactional
@Service
public class CompanyMoneyServiceImpl implements CompanyMoneyService{

	@Resource
	private CompanyMoneyMapper companyMoneyMapper;
	@Override
	public List<CompanyMoney> list() {
		// TODO Auto-generated method stub
		return companyMoneyMapper.list();
	}

	@Override
	public void save(CompanyMoney t) {
		// TODO Auto-generated method stub
		companyMoneyMapper.save(t);
	}

	@Override
	public void update(CompanyMoney t) {
		// TODO Auto-generated method stub
		companyMoneyMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		companyMoneyMapper.remove(id);
	}

	@Override
	public CompanyMoney getById(Integer id) {
		// TODO Auto-generated method stub
		return companyMoneyMapper.getById(id);
	}

	@Override
	public Integer getMoney(CompanyMoney companyMoney) {
		// TODO Auto-generated method stub
		return companyMoneyMapper.getMoney(companyMoney);
	}

}
