package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.MonthOperateMapper;
import com.p2p.pojo.MonthOperate;
import com.p2p.pojo.Page;
import com.p2p.service.MonthOperateService;

@Transactional
@Service
public class MonthOperateServiceImpl implements MonthOperateService {

	@Resource
	private MonthOperateMapper monthOperateMapper;
	
	@Override
	public List<MonthOperate> list0() {
		// TODO Auto-generated method stub
		return monthOperateMapper.list0();
	}
	
	@Override
	public List<MonthOperate> list() {
		// TODO Auto-generated method stub
		return monthOperateMapper.list();
	}

	@Override
	public void save(MonthOperate t) {
		// TODO Auto-generated method stub
		monthOperateMapper.save(t);
	}

	@Override
	public void update(MonthOperate t) {
		// TODO Auto-generated method stub
		monthOperateMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		monthOperateMapper.remove(id);
	}

	@Override
	public MonthOperate getById(Integer id) {
		// TODO Auto-generated method stub
		return monthOperateMapper.getById(id);
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return monthOperateMapper.count();
	}

//	@Override
//	public List<MonthOperate> selectlike(Page page) {
//		// TODO Auto-generated method stub
//		return monthOperateMapper.selectlike(page);
//	}

	@Override
	public List<MonthOperate> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return monthOperateMapper.selectpeople(page);
	}

	@Override
	public List<MonthOperate> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return monthOperateMapper.selectpaging(page);
	}

}
