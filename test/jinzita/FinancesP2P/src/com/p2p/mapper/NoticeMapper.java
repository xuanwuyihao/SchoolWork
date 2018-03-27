package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Notice;
import com.p2p.pojo.Page;


public interface NoticeMapper extends IBaseDao<Integer, Notice> {
	//前台信息披露中的公告显示
	List<Notice> list0();
	//首页公告显示
	List<Notice> list1();
	
	Integer count();
	List<Notice> selectlike(Page page);

	List<Notice> selecttitle (String title);
	List<Notice> selectpeople(Page page);
	List<Notice> selectpaging(Page page);
}