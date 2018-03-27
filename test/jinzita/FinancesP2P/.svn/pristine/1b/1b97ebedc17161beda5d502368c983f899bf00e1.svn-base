package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.GatheringMapper;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.Page;
import com.p2p.service.GatheringService;

@Transactional
@Service
public class GatheringServiceImpl implements GatheringService {

	@Resource
	private GatheringMapper gatheringMapper;
	
	@Override
	public List<Gathering> list() {
		// TODO Auto-generated method stub
		return gatheringMapper.list();
	}

	@Override
	public void save(Gathering t) {
		// TODO Auto-generated method stub
		gatheringMapper.save(t);
	}

	@Override
	public void update(Gathering t) {
		// TODO Auto-generated method stub
		gatheringMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		gatheringMapper.remove(id);
	}

	@Override
	public Gathering getById(Integer id) {
		// TODO Auto-generated method stub
		return gatheringMapper.getById(id);
	}

	@Override
	public List<Gathering> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return gatheringMapper.selectpaging(page);
	}

	@Override
	public List<Gathering> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return gatheringMapper.selectpeople(page);
	}

	@Override
	public List<Gathering> selectlike(Page page) {
		// TODO Auto-generated method stub
		return gatheringMapper.selectlike(page);
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return gatheringMapper.count();
	}

	@Override
	public Float selectSum() {
		// TODO Auto-generated method stub
		return gatheringMapper.selectSum();
	}

	@Override
	public Float selectSumMH(Page page) {
		// TODO Auto-generated method stub
		return gatheringMapper.selectSumMH(page);
	}
	
	@Override
	public List<Gathering> getUserName(Integer userid) {
		// TODO Auto-generated method stub
		return gatheringMapper.getUserName(userid);
	}
	
	@Override
	public List<Gathering> getUserId(Integer userid) {
		// TODO Auto-generated method stub
		return gatheringMapper.getUserId(userid);
	}

	@Override
	public Integer getNameCount(Integer userid) {
		// TODO Auto-generated method stub
		return gatheringMapper.getNameCount(userid);
	}

	@Override
	public List<Gathering> selNameSum(Integer userid) {
		// TODO Auto-generated method stub
		return gatheringMapper.selNameSum(userid);
	}

	@Override
	public void loanMoney(Gathering gathering) {
		// TODO Auto-generated method stub
		gatheringMapper.loanMoney(gathering);
	}

	@Override
	public List<Gathering> getStage(Integer userid) {
		// TODO Auto-generated method stub
		return gatheringMapper.getStage(userid);
	}

}
