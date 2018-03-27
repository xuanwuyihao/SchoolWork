package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Fy;
import com.p2p.pojo.Page;
import com.p2p.pojo.Still;

public interface StillMapper extends IBaseDao<Integer, Still> {
	
	
	List<Still> pageList(Fy f);//分页查询
	
	Integer mhStillCount(Fy f);//模糊查询个数
	
	List<Still> mhStillList(Fy f);//模糊查询
	
	Still dischargeMoney(Integer id);//根据订单号查询还款信息
	
	void updateIsWebStill(Integer id);//手动还款修改还款表数据
   
	List<Still> list2();
	
	Integer count();
	
	List<Still> selectlike(Page page);
	List<Still> selectpeople(Page page);
	List<Still> selectpaging(Page page);
	
	List<Still> selSumMoney(String username);
	List<Still> getStill(String username);
	
	List<Still> selStillListByStatus(String staystatus);
	void updateStillByM(Still s);
}