package com.p2p.service.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.LendBeckonmoneyMapper;
import com.p2p.mapper.LoanMapper;
import com.p2p.mapper.StillMapper;
import com.p2p.mapper.UserMoneyMapper;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.Loan;
import com.p2p.pojo.Page;
import com.p2p.pojo.Still;
import com.p2p.pojo.UserMoney;
import com.p2p.service.UserMoneyService;

import jdk.nashorn.internal.ir.annotations.Reference;

@Transactional
@Service
public class UserMoneyServiceImpl implements UserMoneyService{

	@Resource
	private UserMoneyMapper userMoneyMapper;
	
	@Resource
	private StillMapper stillMapper;
	
	@Resource
	private LendBeckonmoneyMapper lendBeckonmoneyMapper;

	@Resource
	private LoanMapper loanMapper;
	
	@Override
	public List<UserMoney> list() {
		// TODO Auto-generated method stub
		return userMoneyMapper.list();
	}

	@Override
	public void save(UserMoney t) {
		// TODO Auto-generated method stub
		userMoneyMapper.save(t);
	}

	@Override
	public void update(UserMoney t) {
		// TODO Auto-generated method stub
		userMoneyMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		userMoneyMapper.remove(id);
	}

	@Override
	public UserMoney getById(Integer id) {
		// TODO Auto-generated method stub
		return userMoneyMapper.getById(id);
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return userMoneyMapper.count();
	}

	@Override
	public List<UserMoney> selectlike(Page page) {
		// TODO Auto-generated method stub
		return userMoneyMapper.selectlike(page);
	}

	@Override
	public List<UserMoney> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return userMoneyMapper.selectpeople(page);
	}

	@Override
	public List<UserMoney> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return userMoneyMapper.selectpaging(page);
	}

	@Override
	public List<UserMoney> selectSum() {
		// TODO Auto-generated method stub
		return userMoneyMapper.selectSum();
	}

	@Override
	public List<UserMoney> selectSumMH(Page page) {
		// TODO Auto-generated method stub
		return userMoneyMapper.selectSumMH(page);
	}

	@Override
	public UserMoney getByName(String name) {
		// TODO Auto-generated method stub
		return userMoneyMapper.getByName(name);
	}

	@Override
	public void updateMoney(String phone, BigDecimal money) {
		// TODO Auto-generated method stub
		userMoneyMapper.updateMoney(phone, money);
	}


	@Override
	public void updateMoneyByPay(UserMoney u) {
		// TODO Auto-generated method stub
		userMoneyMapper.updateMoneyByPay(u);
	}

	@Override
	public void updateMoneyByM(UserMoney u) {
		// TODO Auto-generated method stub
		userMoneyMapper.updateMoneyByM(u);
	}


	@Override
	public Still dischargeMoney(Integer id) {
		// TODO Auto-generated method stub
		return stillMapper.dischargeMoney(id);
	}

	@Override
	public LendBeckonmoney selLendMoney(Integer id) {
		// TODO Auto-generated method stub
		return lendBeckonmoneyMapper.selLendMoney(id);
	}

	@Override
	public void updateIsWebStill(Integer id) {
		// TODO Auto-generated method stub
		stillMapper.updateIsWebStill(id);
	}

	@Override
	public void saveLoan(Loan loan) {
		// TODO Auto-generated method stub
		loanMapper.save(loan);
	}

	@Override
	public void updateNeedMoney(UserMoney userMoney) {
		// TODO Auto-generated method stub
		userMoneyMapper.updateNeedMoney(userMoney);
	}

	@Override
	public List<UserMoney> selTouzi() {
		// TODO Auto-generated method stub
		return userMoneyMapper.selTouzi();
	}

}
