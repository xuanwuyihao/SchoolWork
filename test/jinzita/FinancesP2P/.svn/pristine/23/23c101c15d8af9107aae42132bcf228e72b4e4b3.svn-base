package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.ExamineApplyMapper;
import com.p2p.mapper.UserInfoMapper;
import com.p2p.pojo.ExamineApply;
import com.p2p.pojo.UserInfo;
import com.p2p.service.UserInfoService;


@Transactional
@Service
public class UserInfoServiceImpl implements UserInfoService{
     
	@Resource
	private UserInfoMapper userInfoMapper;
	
	@Resource
	private ExamineApplyMapper examineApplyMapper;
	
	@Override
	public List<UserInfo> list() {
		return userInfoMapper.list();
	}

	@Override
	public void save(UserInfo t) {
		userInfoMapper.save(t);
	}

	@Override
	public void update(UserInfo t) {
		userInfoMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		userInfoMapper.remove(id);
	}

	@Override
	public UserInfo getById(Integer userId) {
		return userInfoMapper.getById(userId);
	}

	@Override
	public UserInfo getByUserId(Integer userId) {
		return userInfoMapper.getByUserId(userId);
	}
	
	public void insertExamineApply(ExamineApply examineApply) {
		examineApplyMapper.save(examineApply);
	}

	@Override
	public List<ExamineApply> examineList() {
		// TODO Auto-generated method stub
		return examineApplyMapper.list();
	}

	@Override
	public ExamineApply examineById(Integer id) {
		// TODO Auto-generated method stub
		return examineApplyMapper.getById(id);
	}

	@Override
	public void updateExamine(ExamineApply examine) {
		// TODO Auto-generated method stub
		examineApplyMapper.update(examine);
	}

	@Override
	public void removeExamine(Integer id) {
		// TODO Auto-generated method stub
		examineApplyMapper.remove(id);
	}

	@Override
	public Integer countData() {
		// TODO Auto-generated method stub
		return examineApplyMapper.countData();
	}

	@Override
	public Integer getCount(UserInfo userInfo) {
		return userInfoMapper.getCount(userInfo);
	}

	@Override
	public UserInfo getUserInfo(Integer id) {
		return userInfoMapper.getUserInfo(id);
	}

	

	@Override
	public List<ExamineApply> sele() {
		// TODO Auto-generated method stub
		return examineApplyMapper.sele();
	}




}
