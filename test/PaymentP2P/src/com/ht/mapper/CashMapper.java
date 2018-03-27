package com.ht.mapper;

import com.ht.base.IBaseDao;
import com.ht.model.Bankcard;
import com.ht.model.Cash;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashMapper extends IBaseDao<Integer,Cash>{
	
	Integer getCashMaxId();
 
}