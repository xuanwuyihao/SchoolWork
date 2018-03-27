package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.LendApply;
import com.p2p.pojo.LendApplyInfo;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.Page;

public interface LendBeckonmoneyService extends IBaseService<Integer, LendBeckonmoney>{
	
	public List<LendBeckonmoney> list();
	
	public List<LendBeckonmoney> xylist();
	
	public List<LendBeckonmoney> dylist();
	
	public Integer count();
	
	public List<LendBeckonmoney> credit(Page page);
	
	public List<LendBeckonmoney> pledge(Page page);
	
	public List<LendBeckonmoney> selectPage(Page page);
	
	public List<LendBeckonmoney> selectlike(Page page);
	
	public List<LendBeckonmoney> selectpeople(Page page);
	
	public List<LendBeckonmoney> selectpaging(Page page);
	
	public List<LendBeckonmoney> pagingSelect(Page page);
	
	public List<LendBeckonmoney> headline(Page page);

	
	//修改标的剩余可投
	void upateMoney(LendBeckonmoney b);
		
    //修改标的状态
	void upateStatus(LendBeckonmoney b);

	
	//后台招标中的借款
	public List<LendBeckonmoney> list0();
	public Integer count0();
	public List<LendBeckonmoney> selectlike0(Page page);
	public List<LendBeckonmoney> selectpeople0(Page page);
	public List<LendBeckonmoney> selectpaging0(Page page);
	
	public Integer getAmount(LendBeckonmoney lendBeckonmoney);
	public List<LendBeckonmoney> list2();
	public Integer getSum();//所有借款人
	
	//查询最大利率
	public Float selmax();
	
	//前台个人中心借款管理个人借款信息
	public List<LendBeckonmoney> selUserId(String username);
	public Float selUserIdMoney(String username);
	public List<LendBeckonmoney> getUserId(String username);
	public Float getUserIdMoney(String username);
	
	//查找对应状态的标
	List<LendBeckonmoney> selLbkByStatus(String status);

	List<LendBeckonmoney> getList(LendBeckonmoney  lendBeckonmoney);
	List<LendApply> getLend(LendApply lendApply);
	List<LendApplyInfo> getLend_info(LendApplyInfo lendApplyInfo);
}
