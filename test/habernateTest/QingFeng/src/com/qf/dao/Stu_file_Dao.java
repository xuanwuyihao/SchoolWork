package com.qf.dao;

import java.util.List;

import com.qf.model.Stu_file;

public interface Stu_file_Dao {

	public abstract void save(Stu_file stu_file);    //保存
	public abstract void update(Stu_file stu_file);   //修改
	public abstract void delete(int a_id);      //删除
	public abstract List<Stu_file> list();	  //查询全部
	public abstract Stu_file getStu_file(int a_id);	//查询单个
	public abstract void remove(Integer[] a_ids);  //批量移除
}
