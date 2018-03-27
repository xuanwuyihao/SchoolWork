package com.ht.mapper;

import com.ht.base.IBaseDao;
import com.ht.model.Flow;
import com.ht.model.Froze;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrozeMapper extends IBaseDao<Integer,Froze>{
	
	Integer getFrozeMaxId();
   
	List<Froze> getFrozeThaw(Froze  f);
}