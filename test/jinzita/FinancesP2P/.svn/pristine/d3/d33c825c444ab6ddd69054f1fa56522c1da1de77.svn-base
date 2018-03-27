package com.p2p.service.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.p2p.mapper.LendApplyInfoMapper;
import com.p2p.pojo.LendApplyInfo;
import com.p2p.pojo.Page;
import com.p2p.pojo.UserInfo;
import com.p2p.service.LendApplyInfoService;

@Transactional
@Service
public class LendApplyInfoServiceImpl implements LendApplyInfoService{
	
	@Resource
	private LendApplyInfoMapper lendApplyInfoMapper;

	@Override
	public List<LendApplyInfo> list() {
		return lendApplyInfoMapper.list();
	}

	@Override
	public void save(LendApplyInfo t) {
		lendApplyInfoMapper.save(t);
	}

	@Override
	public void update(LendApplyInfo t) {
		lendApplyInfoMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		lendApplyInfoMapper.remove(id);
	}

	@Override
	public LendApplyInfo getById(Integer id) {
		return lendApplyInfoMapper.getById(id);
	}

	@Override
	public List<LendApplyInfo> paging(Page page) {
		return lendApplyInfoMapper.paging(page);
	}

	@Override
	public List<LendApplyInfo> selectlike() {
		
		return lendApplyInfoMapper.selectlike();
	}

	@Override
	public List<LendApplyInfo> selectpeople(Page page) {
	
		return lendApplyInfoMapper.selectpeople(page);
	}

	@Override
	public List<LendApplyInfo> selectcont(Page page) {
		return lendApplyInfoMapper.selectcont(page);
	}

	

	@Override
	public List<LendApplyInfo> username() {
		
		return lendApplyInfoMapper.username();
	}

	@Override
	public void updatefile(LendApplyInfo len) {
		lendApplyInfoMapper.updatefile(len);
	}

	@Override
	public LendApplyInfo listfile(Integer id) {
		return lendApplyInfoMapper.listfile(id);
	}

	@Override
	public String oyh(Integer id) {
	
		return lendApplyInfoMapper.oyh(id);
	}

	@Override
	public void updatestatus(LendApplyInfo len) {
		
		lendApplyInfoMapper.updatestatus(len);
	}


}
