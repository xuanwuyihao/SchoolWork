package com.qf.service.impl;

import java.util.List;

import com.qf.dao.Notice_Dao;
import com.qf.model.Notice;
import com.qf.service.Notice_Service;

public class Notice_ServiceImpl implements Notice_Service{

	private Notice_Dao notice_Dao;
	
	
	
	
	public Notice_Dao getNotice_Dao() {
		return notice_Dao;
	}

	public void setNotice_Dao(Notice_Dao notice_Dao) {
		this.notice_Dao = notice_Dao;
	}

	@Override
	public void save(Notice notice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Notice notice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Notice> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getNotice(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}

}
