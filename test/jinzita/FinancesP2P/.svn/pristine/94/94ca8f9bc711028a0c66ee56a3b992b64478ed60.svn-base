package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Fy;
import com.p2p.pojo.Invest;

public interface InvestMapper extends IBaseDao<Integer, Invest> {
  

	Integer getInvestCountBybid(String bid);
	List<Invest> getInvestBybid(String bid);
	List<Invest> getFyInvestBybid(Fy f);
	void updateInvestStatus(Invest ie);

	Integer getCount();//所有投资用户
	
	List<Invest> selectInvestByBillcode(Integer id);//根据订单号查询所有投资用户
	Float selAllMoney();//所有投资金额

}