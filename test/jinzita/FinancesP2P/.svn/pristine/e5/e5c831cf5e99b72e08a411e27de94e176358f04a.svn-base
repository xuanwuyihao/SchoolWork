package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.LendApplyInfoMapper;
import com.p2p.mapper.LendApplyMapper;
import com.p2p.pojo.LendApply;
import com.p2p.pojo.LendApplyInfo;
import com.p2p.pojo.Page;
import com.p2p.service.LendApplyService;

@Transactional
@Service
public class LendApplyServiceImpl implements LendApplyService{
	
	@Resource
	private LendApplyMapper lendApplyMapper;
	
	@Resource
	private LendApplyInfoMapper lendApplyMapperInfo;

	@Override
	public List<LendApply> list0() {
		return lendApplyMapper.list0();
	}
	
	@Override
	public List<LendApply> list() {
		return lendApplyMapper.list();
	}

	@Override
	public void save(LendApply t) {
		lendApplyMapper.save(t);
	}

	@Override
	public void update(LendApply t) {
		lendApplyMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		lendApplyMapper.remove(id);
	}

	@Override
	public LendApply getById(Integer id) {
		return lendApplyMapper.getById(id);
	}

	@Override
	public List<LendApply> selectpaging(Page page) {
		return lendApplyMapper.selectpaging(page);
	}

	@Override
	public List<LendApply> selectpeople(Page page) {
		return lendApplyMapper.selectpeople(page);
	}

	@Override
	public List<LendApply> selectlike(Page page) {
		return lendApplyMapper.selectlike(page);
	}


	@Override
	public Integer count() {
		return lendApplyMapper.count();
	}

	@Override
	public void saveInfo(LendApplyInfo lendApplyInfo) {
		lendApplyMapperInfo.save(lendApplyInfo);
	}

	@Override
	public List<LendApply> list2() {
		// TODO Auto-generated method stub
		return lendApplyMapper.list2();
	}

	@Override
	public LendApply getusername(String username) {
		return lendApplyMapper.getusername(username);
	}

	
}
