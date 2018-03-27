package com.p2p.service;


import java.util.List;
import java.util.Map;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.LogMoney;
import com.p2p.pojo.Page;

public interface LogMoneyService extends IBaseService<Integer, LogMoney>{
	Integer count();
	
	List<LogMoney> selectlike(Page page);

	List<LogMoney> selectpeople(Page page);
	
	List<LogMoney> selectpaging(Page page);
	
	List<LogMoney> selPhone(Map<String, Object> map);
	
}
