package com.ht.service;

import com.ht.base.IBaseService;
import com.ht.model.Flow;

public interface FlowService extends IBaseService<Integer,Flow>{
	
	void upFlowByOid(Flow f);

}
