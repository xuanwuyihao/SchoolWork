package com.p2p.mapper;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.PlatformCharging;

public interface PlatformChargingMapper extends IBaseDao<Integer, PlatformCharging>{
	Integer maxCount();
}
