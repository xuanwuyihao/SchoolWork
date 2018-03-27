package com.ht.service;

import com.ht.base.IBaseService;
import com.ht.model.Netsave;

public interface NetsaveService extends IBaseService<Integer,Netsave>{
	
	Integer getNetsaveMaxId();

}
