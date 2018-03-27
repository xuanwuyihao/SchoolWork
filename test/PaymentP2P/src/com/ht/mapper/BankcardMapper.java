package com.ht.mapper;

import com.ht.base.IBaseDao;
import com.ht.model.Assets;
import com.ht.model.Bankcard;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankcardMapper extends IBaseDao<Integer,Bankcard>{
	
	Bankcard getMoneyByCardId(String CardId);
	void upBankMoneyByCardId(Bankcard b);
  
}