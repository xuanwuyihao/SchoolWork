package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.AssetsMapper;
import com.ht.model.Assets;
import com.ht.service.AssetsService;

@Transactional
@Service
public class AssetsServiceImpl implements AssetsService{

	@Resource
	private AssetsMapper assetsMapper;
	
	@Override
	public List<Assets> list() {
		// TODO Auto-generated method stub
		return assetsMapper.list();
	}

	@Override
	public Assets getById(Integer id) {
		// TODO Auto-generated method stub
		return assetsMapper.getById(id);
	}

	@Override
	public void insert(Assets t) {
		// TODO Auto-generated method stub
		assetsMapper.insert(t);
	}

	@Override
	public void update(Assets t) {
		// TODO Auto-generated method stub
		assetsMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		assetsMapper.delete(id);
	}

	@Override
	public Assets getAssetsByCustid(String custid) {
		// TODO Auto-generated method stub
		return assetsMapper.getAssetsByCustid(custid);
	}

	@Override
	public void upAssets(Assets a) {
		// TODO Auto-generated method stub
		assetsMapper.upAssets(a);
	}

	@Override
	public void upAssets1(Assets a) {
		// TODO Auto-generated method stub
		assetsMapper.upAssets1(a);
	}

	@Override
	public void upAssets2(Assets a) {
		// TODO Auto-generated method stub
		assetsMapper.upAssets2(a);
	}



}
