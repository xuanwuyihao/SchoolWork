package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.LendBeckonmoneyMapper;
import com.p2p.pojo.LendApply;
import com.p2p.pojo.LendApplyInfo;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.Page;
import com.p2p.service.LendBeckonmoneyService;


@Transactional
@Service
public class LendBeckonmoneyServiceImpl implements LendBeckonmoneyService{

	@Resource
	private LendBeckonmoneyMapper lendBeckonmoneyMapper;

	@Override
	public List<LendBeckonmoney> list() {
		return lendBeckonmoneyMapper.list();
	}
	
	@Override
	public void save(LendBeckonmoney t) {
		lendBeckonmoneyMapper.save(t);
	}

	@Override
	public void update(LendBeckonmoney t) {
		lendBeckonmoneyMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		lendBeckonmoneyMapper.remove(id);
	}

	@Override
	public LendBeckonmoney getById(Integer id) {
		return lendBeckonmoneyMapper.getById(id);
	}

	@Override
	public List<LendBeckonmoney> xylist() {
		return lendBeckonmoneyMapper.xylist();
	}

	@Override
	public List<LendBeckonmoney> dylist() {
		return lendBeckonmoneyMapper.dylist();
	}

	@Override
	public Integer count() {
		return lendBeckonmoneyMapper.count();
	}

	@Override
	public List<LendBeckonmoney> credit(Page page) {
		return lendBeckonmoneyMapper.credit(page);
	}

	@Override
	public List<LendBeckonmoney> pledge(Page page) {
		return lendBeckonmoneyMapper.pledge(page);
	}

	@Override
	public List<LendBeckonmoney> selectPage(Page page) {
		return lendBeckonmoneyMapper.selectPage(page);	
	}

	@Override
	public List<LendBeckonmoney> selectlike(Page page) {
		return lendBeckonmoneyMapper.selectlike(page);
	}

	@Override
	public List<LendBeckonmoney> selectpeople(Page page) {
		return lendBeckonmoneyMapper.selectpeople(page);
	}

	@Override
	public List<LendBeckonmoney> selectpaging(Page page) {
		return lendBeckonmoneyMapper.selectpaging(page);
	}

	@Override
	public List<LendBeckonmoney> pagingSelect(Page page) {
		return lendBeckonmoneyMapper.pagingSelect(page);
	}

	@Override
	public List<LendBeckonmoney> headline(Page page) {
		return lendBeckonmoneyMapper.headline(page);
	}

	@Override
	public void upateMoney(LendBeckonmoney b) {
		// TODO Auto-generated method stub
		lendBeckonmoneyMapper.upateMoney(b);
	}

	@Override
	public void upateStatus(LendBeckonmoney b) {
		// TODO Auto-generated method stub
		lendBeckonmoneyMapper.upateStatus(b);
	}

	/*@Override
	public void selectPage(Page pageInfo) {
		
		//在分页方法中获取当前页和总的大小
		Page<LendBeckonmoney> page = new Page(pageInfo.getNowpage(),pageInfo.getSize());
		
		//用list封装 Mapper方法里需要获取的分页参数（page） 和要 查询的条件=(分页实体类的map集合)
		List<LendBeckonmoney> list = lendBeckonmoneyMapper.selectPage(page, pageInfo.getCondition());
		System.out.println("size"+pageInfo.getCondition());
		//把记录放进实体类的记录参数中
		pageInfo.setRows(list);
		
		//获取分页方法中的总数属性 放入本地的实体类中
		pageInfo.setTotal(page.getTotal());
	}*/
	
	
	//后台招标中的借款
	@Override
	public List<LendBeckonmoney> list0() {
		return lendBeckonmoneyMapper.list0();
	}
	@Override
	public Integer count0() {
		return lendBeckonmoneyMapper.count0();
	}
	@Override
	public List<LendBeckonmoney> selectlike0(Page page) {
		return lendBeckonmoneyMapper.selectlike0(page);
	}
	@Override
	public List<LendBeckonmoney> selectpeople0(Page page) {
		return lendBeckonmoneyMapper.selectpeople0(page);
	}
	@Override
	public List<LendBeckonmoney> selectpaging0(Page page) {
		return lendBeckonmoneyMapper.selectpaging0(page);
	}

	@Override
	public Integer getAmount(LendBeckonmoney lendBeckonmoney) {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.getAmount(lendBeckonmoney);
	}

	@Override
	public List<LendBeckonmoney> list2() {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.list2();
	}

	@Override
	public Integer getSum() {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.getSum();
	}

	@Override
	public Float selmax() {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.selmax();
	}

	@Override
	public List<LendBeckonmoney> selUserId(String username) {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.selUserId(username);
	}

	@Override
	public List<LendBeckonmoney> getUserId(String username) {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.getUserId(username);
	}

	@Override
	public Float selUserIdMoney(String username) {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.selUserIdMoney(username);
	}

	@Override
	public Float getUserIdMoney(String username) {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.getUserIdMoney(username);
	}

	@Override
	public List<LendBeckonmoney> selLbkByStatus(String status) {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.selLbkByStatus(status);
	}

	@Override
	public List<LendBeckonmoney> getList(LendBeckonmoney lendBeckonmoney) {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.getList(lendBeckonmoney);
	}

	@Override
	public List<LendApply> getLend(LendApply lendApply) {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.getLend(lendApply);
	}

	@Override
	public List<LendApplyInfo> getLend_info(LendApplyInfo lendApplyInfo) {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.getLend_info(lendApplyInfo);
	}


}
