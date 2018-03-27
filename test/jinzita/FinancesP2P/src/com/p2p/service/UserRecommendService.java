package com.p2p.service;

import java.util.List;
import java.util.Map;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.Page;
import com.p2p.pojo.UserRecommend;


public interface UserRecommendService extends IBaseService<Integer, UserRecommend>{
	
	List<UserRecommend> selectpaging(Page page); 

	List<UserRecommend> selectpeople(Page page);
	
	List<UserRecommend> selectlike(Page page);
	
	Integer count();
	
	List<UserRecommend> selCode(Map<String, Object> map);
}
