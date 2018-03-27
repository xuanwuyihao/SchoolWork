package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.NetsaveMapper;
import com.ht.model.Netsave;
import com.ht.service.NetsaveService;

@Transactional
@Service
public class NetsaveServiceImpl implements NetsaveService{

	@Resource
	private NetsaveMapper netsaveMapper;
	
	@Override
	public List<Netsave> list() {
		// TODO Auto-generated method stub
		return netsaveMapper.list();
	}

	@Override
	public Netsave getById(Integer id) {
		// TODO Auto-generated method stub
		return netsaveMapper.getById(id);
	}

	@Override
	public void insert(Netsave t) {
		// TODO Auto-generated method stub
		netsaveMapper.insert(t);
	}

	@Override
	public void update(Netsave t) {
		// TODO Auto-generated method stub
		netsaveMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		netsaveMapper.delete(id);
	}

	@Override
	public Integer getNetsaveMaxId() {
		// TODO Auto-generated method stub
		return netsaveMapper.getNetsaveMaxId();
	}

}
