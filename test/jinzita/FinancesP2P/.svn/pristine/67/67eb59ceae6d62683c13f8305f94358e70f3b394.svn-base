package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.NoticeMapper;
import com.p2p.pojo.Notice;
import com.p2p.pojo.Page;
import com.p2p.service.NoticeService;

@Transactional
@Service
public class NoticeServliceImpl implements NoticeService{
 
	@Resource
	private NoticeMapper  noticeMapper;
	
	@Override
	public List<Notice> list0() {
		// TODO Auto-generated method stub
		//前台信息披露中的公告显示
		return noticeMapper.list0();
	}
	
	@Override
	public List<Notice> list1() {
		// TODO Auto-generated method stub
		//首页公告显示
		return noticeMapper.list1();
	}
	
	@Override
	public List<Notice> list() {
		// TODO Auto-generated method stub
		return noticeMapper.list();
	}

	@Override
	public void save(Notice t) {
		// TODO Auto-generated method stub
		noticeMapper.save(t);
	}

	@Override
	public void update(Notice t) {
		// TODO Auto-generated method stub
		noticeMapper.update(t);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		noticeMapper.remove(id);
	}

	@Override
	public Notice getById(Integer id) {
		// TODO Auto-generated method stub
		return noticeMapper.getById(id);
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return noticeMapper.count();
	}

	@Override
	public List<Notice> selectpeople(Page page) {
		// TODO Auto-generated method stub
		return noticeMapper.selectpeople(page);
	}
	
	@Override
	public List<Notice> selectlike(Page page) {
		// TODO Auto-generated method stub
		return noticeMapper.selectlike(page);
	}
	
	@Override
	public List<Notice> selectpaging(Page page) {
		// TODO Auto-generated method stub
		return noticeMapper.selectpaging(page);
	}


}
