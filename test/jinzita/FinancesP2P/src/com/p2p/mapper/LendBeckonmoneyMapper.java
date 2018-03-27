package com.p2p.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.p2p.commons.IBaseDao;
import com.p2p.pojo.LendApply;
import com.p2p.pojo.LendApplyInfo;
import com.p2p.pojo.LendBeckonmoney;

import com.p2p.pojo.Page;


public interface LendBeckonmoneyMapper extends IBaseDao<Integer, LendBeckonmoney> {
	//前台页面显示查询
	List<LendBeckonmoney> xylist();
	List<LendBeckonmoney> dylist();
	
	//信用标查询
	List<LendBeckonmoney> credit(Page page);
	
	//抵押标查询
	List<LendBeckonmoney> pledge(Page page);
	
	//不同的条件查询
	List<LendBeckonmoney> selectPage(Page page);
	
	//前台分页
	List<LendBeckonmoney> pagingSelect(Page page);
	
	//前台模糊查询标题
	List<LendBeckonmoney> headline(Page page);
	
	//总数
	Integer count();
	
	//后台分页
	List<LendBeckonmoney> selectlike(Page page);

	//后台模糊查询1
	List<LendBeckonmoney> selectpeople(Page page);
	
	//后台模糊查询2
	List<LendBeckonmoney> selectpaging(Page page);
	

	//修改标的剩余可投
	void upateMoney(LendBeckonmoney b);
	
	//修改标的状态
	void upateStatus(LendBeckonmoney b);

	//后台招标中的借款
	List<LendBeckonmoney> list0();
	
	//招标中的借款总数
	Integer count0();
	
	//招标中的借款后台分页
	List<LendBeckonmoney> selectlike0(Page page);

	//招标中的借款后台模糊查询1
	List<LendBeckonmoney> selectpeople0(Page page);
	
	//招标中的借款后台模糊查询2
	List<LendBeckonmoney> selectpaging0(Page page);
	
	Integer getAmount(LendBeckonmoney lendBeckonmoney);
	
	List<LendBeckonmoney> list2();
	 
	Integer getSum();//所有借款人
	
	//根据订单号查询借款人的借款金额
	LendBeckonmoney selLendMoney(Integer id);
	
	//查询最大利率
	Float selmax();
	
	//前台个人中心借款管理个人借款信息
	List<LendBeckonmoney> selUserId(String username);
	Float selUserIdMoney(String username);
	List<LendBeckonmoney> getUserId(String username);
	Float getUserIdMoney(String username);
	
	//查找对应状态的标
	List<LendBeckonmoney> selLbkByStatus(String status);
	
	List<LendBeckonmoney> getList(LendBeckonmoney lendBeckonmoney);
	List<LendApply> getLend(LendApply lendApply);
	List<LendApplyInfo> getLend_info(LendApplyInfo lendApplyInfo);
}