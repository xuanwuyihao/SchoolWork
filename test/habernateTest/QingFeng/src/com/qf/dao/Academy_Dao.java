package com.qf.dao;

import java.util.List;
import java.util.Map;

import com.qf.model.Academy;

public interface Academy_Dao {
		
	
	public abstract void save(Academy academy);    //保存
	public abstract void update(Academy academy);   //修改
	public abstract void delete(int a_id);      //删除
	public abstract Academy getAcademy(int a_id);	//查询单个
	public abstract void remove(Integer[] a_ids);  //批量移除
	public abstract Map<String, Object> list();    //json��ʽ��ѯ����
}
