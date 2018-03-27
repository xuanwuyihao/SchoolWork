package com.p2p.service;

import java.util.List;
import java.util.Map;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.LogLift;
import com.p2p.pojo.Page;

public interface LogLiftService extends IBaseService<Integer, LogLift>{

	List<LogLift> selPhone(Map<String, Object> map);
	Integer rechargeCount(String username);
	
	Integer count();
	List<LogLift> selectlike(Page page);
	List<LogLift> selectpeople(Page page);
	List<LogLift> selectpaging(Page page);
	
}
