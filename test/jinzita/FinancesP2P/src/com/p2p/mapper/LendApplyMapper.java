package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.LendApply;
import com.p2p.pojo.Page;

public interface LendApplyMapper extends IBaseDao<Integer, LendApply> {
	
	List<LendApply> list0(); 
	
	List<LendApply> selectpaging(Page page); 

	List<LendApply> selectpeople(Page page);
	
	List<LendApply> selectlike(Page page);
	
	Integer count();
	
	List<LendApply> list2();
	
	LendApply getusername(String username);
}