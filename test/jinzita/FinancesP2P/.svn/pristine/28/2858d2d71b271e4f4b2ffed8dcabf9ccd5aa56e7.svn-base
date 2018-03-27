package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.ExamineApply;
import com.p2p.pojo.UserInfo;

public interface UserInfoService extends IBaseService<Integer, UserInfo>{
	UserInfo getByUserId(Integer userId);
	//添加申请额度
	void insertExamineApply(ExamineApply examineApply);
	
	//查看申请额度
	List<ExamineApply> examineList();
	
	//根据id查找申请额度数据
	ExamineApply examineById(Integer id);
	
	//审核额度
	void updateExamine(ExamineApply examine);
	
	//删除申请
	void removeExamine(Integer id);
	
	//查询申请条数
	Integer countData();

	Integer getCount(UserInfo userInfo);
	
	//额度管理
		List<ExamineApply> sele();

	UserInfo getUserInfo(Integer id);
	
	
}
