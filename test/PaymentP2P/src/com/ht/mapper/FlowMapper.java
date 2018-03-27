package com.ht.mapper;

import com.ht.base.IBaseDao;
import com.ht.model.Cash;
import com.ht.model.Flow;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowMapper extends IBaseDao<Integer,Flow>{
	
	void upFlowByOid(Flow f);
   
}