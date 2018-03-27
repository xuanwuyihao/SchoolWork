package com.ht.service;

import com.ht.base.IBaseService;
import com.ht.model.Users;

public interface UsersService extends IBaseService<Integer,Users>{
	
	Users getByPhone(String userphone);

}
