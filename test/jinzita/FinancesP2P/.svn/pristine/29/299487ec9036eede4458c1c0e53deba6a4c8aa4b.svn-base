package com.p2p.mapper;

import java.util.List;
import java.util.Map;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.UserRecommend;
import com.p2p.pojo.Page;

public interface UserRecommendMapper extends IBaseDao<Integer, UserRecommend> {
	List<UserRecommend> selectpaging(Page page); 

	List<UserRecommend> selectpeople(Page page);
	
	List<UserRecommend> selectlike(Page page);
	
	Integer count();
	
	List<UserRecommend> selCode(Map<String, Object> map);
}