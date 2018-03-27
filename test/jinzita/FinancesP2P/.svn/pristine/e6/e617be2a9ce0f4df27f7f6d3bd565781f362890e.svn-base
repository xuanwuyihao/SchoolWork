package com.p2p.mapper;

import java.math.BigDecimal;
import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Page;
import com.p2p.pojo.User;
import com.p2p.pojo.UserMoney;

public interface UserMoneyMapper extends IBaseDao<Integer, UserMoney>{

	
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

	
	//添加用户可用金额和全部金额
	void updateNeedMoney(UserMoney userMoney);

	//投资排行榜
	List<UserMoney> selTouzi(); 
}


