package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.Page;

public interface GatheringMapper extends IBaseDao<Integer,Gathering> {
	List<Gathering> getGatherListByLidAndTitle(Gathering g);
	
	List<Gathering> selectpaging(Page page); 

	List<Gathering> selectpeople(Page page);
	
	List<Gathering> selectlike(Page page);
	
	Integer count();
	
	Float selectSum();
	
	Float selectSumMH(Page page);
	
	//手动放款修改数据
	void loanMoney(Gathering gathering);
	
	//个人中心显示个人的投资信息
	List<Gathering> getUserName(Integer userid);
	List<Gathering> getUserId(Integer userid);
	List<Gathering> getStage(Integer userid);
	Integer getNameCount(Integer userid);
	List<Gathering> selNameSum(Integer userid);
	List<Gathering> list2();
	
	void updateGatheringByM(Gathering gath);
}