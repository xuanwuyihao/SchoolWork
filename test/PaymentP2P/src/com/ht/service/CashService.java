package com.ht.service;

import com.ht.base.IBaseService;
import com.ht.model.Cash;

public interface CashService extends IBaseService<Integer,Cash>{
	
	Integer getCashMaxId();

}
