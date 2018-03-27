package com.qf.service;

import java.util.List;

import com.qf.model.Relation;

public interface Relation_Service {

	public abstract void save(Relation relation);    //保存
	public abstract void update(Relation relation);   //修改
	public abstract void delete(int a_id);      //删除
	public abstract List<Relation> list();	  //查询全部
	public abstract Relation getRelation(int a_id);	//查询单个
	public abstract void remove(Integer[] a_ids);  //批量移除
}
