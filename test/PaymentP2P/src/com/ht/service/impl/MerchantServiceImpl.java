package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.MerchantMapper;
import com.ht.model.Merchant;
import com.ht.service.MerchantService;

@Transactional
@Service
public class MerchantServiceImpl implements MerchantService{

	@Resource
	private MerchantMapper merchantMapper;
	
	@Override
	public List<Merchant> list() {
		// TODO Auto-generated method stub
		return merchantMapper.list();
	}

	@Override
	public Merchant getById(Integer id) {
		// TODO Auto-generated method stub
		return merchantMapper.getById(id);
	}

	@Override
	public void insert(Merchant t) {
		// TODO Auto-generated method stub
		merchantMapper.insert(t);
	}

	@Override
	public void update(Merchant t) {
		// TODO Auto-generated method stub
		merchantMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		merchantMapper.delete(id);
	}

}
