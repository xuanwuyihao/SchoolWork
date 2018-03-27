package com.qf.dao;

import java.util.List;
import java.util.Map;

import com.qf.model.Academy;

public interface Academy_Dao {
		
	
	public abstract void save(Academy academy);    //淇濆瓨
	public abstract void update(Academy academy);   //淇敼
	public abstract void delete(int a_id);      //鍒犻櫎
	public abstract Academy getAcademy(int a_id);	//鏌ヨ鍗曚釜
	public abstract void remove(Integer[] a_ids);  //鎵归噺绉婚櫎
	public abstract Map<String, Object> list();    //json格式查询数据
}
