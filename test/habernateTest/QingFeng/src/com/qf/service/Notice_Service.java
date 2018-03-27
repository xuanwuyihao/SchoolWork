package com.qf.service;

import java.util.List;

import com.qf.model.Notice;

public interface Notice_Service {

	public abstract void save(Notice notice);    //保存
	public abstract void update(Notice notice);   //修改
	public abstract void delete(int a_id);      //删除
	public abstract List<Notice> list();	  //查询全部
	public abstract Notice getNotice(int a_id);	//查询单个
	public abstract void remove(Integer[] a_ids);  //批量移除
}
