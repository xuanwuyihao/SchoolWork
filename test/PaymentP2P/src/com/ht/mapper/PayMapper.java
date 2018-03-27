package com.ht.mapper;

import com.ht.base.IBaseDao;
import com.ht.model.Netsave;
import com.ht.model.Pay;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayMapper extends IBaseDao<Integer,Pay>{
  
	Integer getPayMaxId();
	void updatePayStatus(Pay p);
	List<Pay> getOrdidByPay(Pay p);
}