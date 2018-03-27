package com.p2p.mapper;

import java.util.List;
import java.util.Map;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.LogRecharge;
import com.p2p.pojo.Page;

public interface LogRechargeMapper extends IBaseDao<Integer, LogRecharge> {
   
	List<LogRecharge> selPhone(Map<String, Object> map);
	LogRecharge maxRecharge(String phone);
	Integer rechargeCount(String phone);
	
	Integer count();
	List<LogRecharge> selectlike(Page page);
	List<LogRecharge> selectpeople(Page page);
	List<LogRecharge> selectpaging(Page page);
}