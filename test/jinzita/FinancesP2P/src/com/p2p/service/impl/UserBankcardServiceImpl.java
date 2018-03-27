package com.p2p.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.UserBankcardMapper;
import com.p2p.pojo.UserBankcard;
import com.p2p.service.UserBankcardService;
@Transactional
@Service
public class UserBankcardServiceImpl implements UserBankcardService{
    
	@Resource
	private UserBankcardMapper userBankcardMapper;
	
	@Override
	public List<UserBankcard> list() {
		// TODO Auto-generated method stub
		return userBankcardMapper.list();
	}

	@Override
	public void save(UserBankcard t) {
		// TODO Auto-generated method stub
		userBankcardMapper.save(t);
	}

	@Override
	public void update(UserBankcard t) {
		// TODO Auto-generated method stub
		userBankcardMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		userBankcardMapper.remove(id);
	}

	@Override
	public UserBankcard getById(Integer id) {
		// TODO Auto-generated method stub
		return userBankcardMapper.getById(id);
	}

	@Override
	public UserBankcard getByUserinfoId(String userInfoId) {
		// TODO Auto-generated method stub
		return userBankcardMapper.getByUserinfoId(userInfoId);
	}

	@Override
	public Integer maxCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userBankcardMapper.maxCount(map);
	}

	@Override
	public List<UserBankcard> bankCard_List(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userBankcardMapper.bankCard_List(map);
	}

}
