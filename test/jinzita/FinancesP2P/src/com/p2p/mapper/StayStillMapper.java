package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Page;
import com.p2p.pojo.StayStill;

public interface StayStillMapper extends IBaseDao<Integer, StayStill> {

	Integer count();
	List<StayStill> selectlike(Page page);
	List<StayStill> selectpeople(Page page);
	List<StayStill> selectpaging(Page page);
	
	void updateDescription(StayStill stayStill);
}
