package com.ht.service;

import java.util.List;

import com.ht.base.IBaseService;
import com.ht.model.Pay;

public interface PayService extends IBaseService<Integer,Pay>{

	Integer getPayMaxId();
	void updatePayStatus(Pay p);
	List<Pay> getOrdidByPay(Pay p);
}
