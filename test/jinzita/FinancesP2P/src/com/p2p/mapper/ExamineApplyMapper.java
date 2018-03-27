package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.ExamineApply;

public interface ExamineApplyMapper extends IBaseDao<Integer,ExamineApply> {
	//查询申请条数
	Integer countData();
	
	//借款管理
		List<ExamineApply> sele();
}