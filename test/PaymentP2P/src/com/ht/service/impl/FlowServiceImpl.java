package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.FlowMapper;
import com.ht.model.Flow;
import com.ht.service.FlowService;

@Transactional
@Service
public class FlowServiceImpl implements FlowService{

	@Resource
	private FlowMapper flowMapper;
	
	@Override
	public List<Flow> list() {
		// TODO Auto-generated method stub
		return flowMapper.list();
	}

	@Override
	public Flow getById(Integer id) {
		// TODO Auto-generated method stub
		return flowMapper.getById(id);
	}

	@Override
	public void insert(Flow t) {
		// TODO Auto-generated method stub
		flowMapper.insert(t);
	}

	@Override
	public void update(Flow t) {
		// TODO Auto-generated method stub
		flowMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		flowMapper.delete(id);
	}

	@Override
	public void upFlowByOid(Flow f) {
		// TODO Auto-generated method stub
		flowMapper.upFlowByOid(f);
	}

}
