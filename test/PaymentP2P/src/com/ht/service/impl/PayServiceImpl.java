package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.PayMapper;
import com.ht.model.Pay;
import com.ht.service.PayService;

@Transactional
@Service
public class PayServiceImpl implements PayService{

	@Resource
	private PayMapper payMapper;
	
	@Override
	public List<Pay> list() {
		// TODO Auto-generated method stub
		return payMapper.list();
	}

	@Override
	public Pay getById(Integer id) {
		// TODO Auto-generated method stub
		return payMapper.getById(id);
	}

	@Override
	public void insert(Pay t) {
		// TODO Auto-generated method stub
		payMapper.insert(t);
	}

	@Override
	public void update(Pay t) {
		// TODO Auto-generated method stub
		payMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
        payMapper.delete(id);
	}

	@Override
	public Integer getPayMaxId() {
		// TODO Auto-generated method stub
		return payMapper.getPayMaxId();
	}

	@Override
	public void updatePayStatus(Pay p) {
		// TODO Auto-generated method stub
		payMapper.updatePayStatus(p);
	}

	@Override
	public List<Pay> getOrdidByPay(Pay p) {
		// TODO Auto-generated method stub
		return payMapper.getOrdidByPay(p);
	}

}
