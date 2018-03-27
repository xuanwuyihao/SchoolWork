package com.p2p.service;

import java.math.BigDecimal;
import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.Loan;
import com.p2p.pojo.Page;
import com.p2p.pojo.Still;
import com.p2p.pojo.UserMoney;

public interface UserMoneyService extends IBaseService<Integer, UserMoney>{

	
	Integer count();
	List<UserMoney> selectlike(Page page);
	List<UserMoney> selectpeople(Page page);
	List<UserMoney> selectpaging(Page page);
	List<UserMoney> selectSum();
	List<UserMoney> selectSumMH(Page page);
	
	UserMoney getByName(String name);
	void updateMoney(String phone,BigDecimal money);

	void updateMoneyByPay(UserMoney u);
	void updateMoneyByM(UserMoney u);

	
	Still dischargeMoney(Integer id);//根据订单号查询还款信息
	
	//根据订单号查询借款人的借款金额
	LendBeckonmoney selLendMoney(Integer id);
	
	void updateIsWebStill(Integer id);//手动还款修改还款表数据
	
	void saveLoan(Loan loan);//添加手动还款表中的数据
	
	//添加用户可用金额和全部金额
	void updateNeedMoney(UserMoney userMoney);
	
	//投资排行榜
	List<UserMoney> selTouzi(); 

}
