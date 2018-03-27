package com.ht.service;

import com.ht.base.IBaseService;

import com.ht.model.Bankcard;

public interface BankcardService extends IBaseService<Integer,Bankcard>{
	
	Bankcard getMoneyByCardId(String CardId);
	void upBankMoneyByCardId(Bankcard b);

}
