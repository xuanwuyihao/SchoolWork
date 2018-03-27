package com.ht.mapper;

import com.ht.base.IBaseDao;
import com.ht.model.Pay;
import com.ht.model.Thaw;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThawMapper extends IBaseDao<Integer,Thaw>{
	
	Integer getThawMaxId();
   
}