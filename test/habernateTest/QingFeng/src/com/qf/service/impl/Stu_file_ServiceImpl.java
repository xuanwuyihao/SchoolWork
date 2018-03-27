package com.qf.service.impl;

import java.util.List;

import com.qf.dao.Stu_file_Dao;
import com.qf.model.Stu_file;
import com.qf.service.Stu_file_Service;

public class Stu_file_ServiceImpl implements Stu_file_Service{

	private Stu_file_Dao stu_file_Dao;

	public Stu_file_Dao getStu_file_Dao() {
		return stu_file_Dao;
	}

	public void setStu_file_Dao(Stu_file_Dao stu_file_Dao) {
		this.stu_file_Dao = stu_file_Dao;
	}

	@Override
	public void save(Stu_file stu_file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Stu_file stu_file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int a_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Stu_file> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stu_file getStu_file(int a_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer[] a_ids) {
		// TODO Auto-generated method stub
		
	}
}
