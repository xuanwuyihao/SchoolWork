package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Page;
import com.p2p.pojo.UserOpinion;

public interface UserOpinionMapper extends IBaseDao<Integer, UserOpinion> {

	List<UserOpinion> selectpaging(Page page); 

	List<UserOpinion> selectpeople(Page page);
	
	List<UserOpinion> selectlike(Page page);
	
	Integer count();//查询总数
	
	//意见反馈
	List<UserOpinion> insert(UserOpinion uop);
    
}