package com.ht.service;

import java.util.List;

import com.ht.base.IBaseService;
import com.ht.model.Froze;

public interface FrozeService extends IBaseService<Integer,Froze>{

	Integer getFrozeMaxId();
	
	List<Froze> getFrozeThaw(Froze  f);
	
}
