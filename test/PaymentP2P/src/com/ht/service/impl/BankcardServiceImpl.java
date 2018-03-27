package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.ht.mapper.BankcardMapper;
import com.ht.model.Bankcard;
import com.ht.service.BankcardService;

@Transactional
@Service
public class BankcardServiceImpl implements BankcardService{

	@Resource
	private BankcardMapper bankcardMapper;
	
	@Override
	public List<Bankcard> list() {
		// TODO Auto-generated method stub
		return bankcardMapper.list();
	}

	@Override
	public Bankcard getById(Integer id) {
		// TODO Auto-generated method stub
		return bankcardMapper.getById(id);
	}

	@Override
	public void insert(Bankcard t) {
		// TODO Auto-generated method stub
		bankcardMapper.insert(t);
	}

	@Override
	public void update(Bankcard t) {
		// TODO Auto-generated method stub
		bankcardMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		bankcardMapper.delete(id);
	}

	@Override
	public Bankcard getMoneyByCardId(String CardId) {
		// TODO Auto-generated method stub
		return bankcardMapper.getMoneyByCardId(CardId);
	}

	@Override
	public void upBankMoneyByCardId(Bankcard b) {
		// TODO Auto-generated method stub
		bankcardMapper.upBankMoneyByCardId(b);
	}
	
	

}
