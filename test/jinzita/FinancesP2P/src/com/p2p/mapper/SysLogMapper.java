package com.p2p.mapper;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.SysLog;

public interface SysLogMapper extends IBaseDao<Integer, SysLog>{
	Integer maxCount();
}
