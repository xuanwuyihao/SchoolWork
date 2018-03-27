package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.LendApply;
import com.p2p.pojo.Page;
import com.p2p.pojo.UserOpinion;

public interface UseropinionService extends IBaseService<Integer, UserOpinion>{
	
	List<UserOpinion> selectpaging(Page page); 

	List<UserOpinion> selectpeople(Page page);
	
	List<UserOpinion> selectlike(Page page);
	
	Integer count();//查询总数
	
	//意见反馈
		List<UserOpinion> insert(UserOpinion uop);

}
