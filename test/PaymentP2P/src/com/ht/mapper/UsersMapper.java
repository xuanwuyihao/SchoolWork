package com.ht.mapper;

import com.ht.base.IBaseDao;

import com.ht.model.Users;


public interface UsersMapper extends IBaseDao<Integer,Users>{
	
	Users getByPhone(String userphone);
   
}