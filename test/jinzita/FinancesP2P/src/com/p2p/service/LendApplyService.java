package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.LendApply;
import com.p2p.pojo.LendApplyInfo;
import com.p2p.pojo.Page;


public interface LendApplyService extends IBaseService<Integer, LendApply>{
	
	List<LendApply> list0();
	
	List<LendApply> selectpaging(Page page); 

	List<LendApply> selectpeople(Page page);
	
	List<LendApply> selectlike(Page page);
	
	Integer count();//查询总数
	
	void saveInfo(LendApplyInfo lendApplyInfo);
	
	List<LendApply> list2();
	
	LendApply getusername(String username);
}
