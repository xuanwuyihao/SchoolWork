package com.ht.mapper;

import java.io.Serializable;

import com.ht.base.IBaseDao;
import com.ht.model.User;

public interface UserMapper extends IBaseDao<Integer,User>{
	
	User getByName(String name);

}
