package com.ht.service;

import com.ht.base.IBaseService;
import com.ht.model.Thaw;

public interface ThawService extends IBaseService<Integer,Thaw>{

	Integer getThawMaxId();
}
