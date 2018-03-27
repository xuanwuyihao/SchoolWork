package com.p2p.mapper;

import java.util.List;
import java.util.Map;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.LogLift;
import com.p2p.pojo.LogRecharge;
import com.p2p.pojo.Page;

public interface LogLiftMapper extends IBaseDao<Integer, LogLift> {
   
	Integer count();
	List<LogLift> selectlike(Page page);
	List<LogLift> selectpeople(Page page);
	List<LogLift> selectpaging(Page page);
	
	List<LogLift> selPhone(Map<String, Object> map);
	Integer rechargeCount(String username);
	
	List<LogLift> test(Map<String, Object> map);
}