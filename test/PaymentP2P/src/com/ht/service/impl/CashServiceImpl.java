package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.CashMapper;
import com.ht.model.Cash;
import com.ht.service.CashService;

@Transactional
@Service
public class CashServiceImpl implements CashService{

	@Resource
	private CashMapper cashMapper;
	
	@Override
	public List<Cash> list() {
		// TODO Auto-generated method stub
		return cashMapper.list();
	}

	@Override
	public Cash getById(Integer id) {
		// TODO Auto-generated method stub
		return cashMapper.getById(id);
	}

	@Override
	public void insert(Cash t) {
		// TODO Auto-generated method stub
		cashMapper.insert(t);
	}

	@Override
	public void update(Cash t) {
		// TODO Auto-generated method stub
		cashMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		cashMapper.delete(id);
	}

	@Override
	public Integer getCashMaxId() {
		// TODO Auto-generated method stub
		return cashMapper.getCashMaxId();
	}

}
