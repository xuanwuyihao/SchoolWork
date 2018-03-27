package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Page;
import com.p2p.pojo.Photo;

public interface PhotoMapper extends IBaseDao<Integer,Photo>{
	
	void update1(Photo photo);
	void update2(Photo photo);
	//分页查询数据
	List<Photo> pagingSelect(Page page);
	//前台轮播图显示
	List<Photo> lookPhoto();
}
