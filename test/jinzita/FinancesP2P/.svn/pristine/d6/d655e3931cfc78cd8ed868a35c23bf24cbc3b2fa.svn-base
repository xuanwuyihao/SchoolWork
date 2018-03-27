package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.Fy;
import com.p2p.pojo.Page;
import com.p2p.pojo.StayStill;
import com.p2p.pojo.Still;

public interface StillService extends IBaseService<Integer, Still>{

	List<Still> pageList(Fy f);//分页查询
	
	Integer mhStillCount(Fy f);//模糊查询个数
	
	List<Still> mhStillList(Fy f);//模糊查询
	
	List<Still> list2();
	
	Integer count();
	
	List<Still> selectlike(Page page);
	List<Still> selectpeople(Page page);
	List<Still> selectpaging(Page page);
	
	List<Still> selSumMoney(String username);
	List<Still> getStill(String username);
	
}
