package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.MonthOperate;
import com.p2p.pojo.Page;

public interface MonthOperateService extends IBaseService<Integer, MonthOperate> {
	List<MonthOperate> list0();
	
	Integer count();
	
//	List<MonthOperate> selectlike(Page page);

	List<MonthOperate> selectpeople(Page page);
	
	List<MonthOperate> selectpaging(Page page);
}
