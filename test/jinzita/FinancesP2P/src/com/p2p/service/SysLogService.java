package com.p2p.service;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.SysLog;

public interface SysLogService extends IBaseService<Integer, SysLog>{
	Integer maxCount();
}
