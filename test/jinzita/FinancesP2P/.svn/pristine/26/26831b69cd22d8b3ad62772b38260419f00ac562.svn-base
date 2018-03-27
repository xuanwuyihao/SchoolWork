package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.Page;
import com.p2p.pojo.StayStill;

public interface StayStillService extends IBaseService<Integer, StayStill>{

	Integer count();
	List<StayStill> selectlike(Page page);
	List<StayStill> selectpeople(Page page);
	List<StayStill> selectpaging(Page page);
	
	//修改逾期表中网站是否代还
	void updateDescription(StayStill stayStill);
}
