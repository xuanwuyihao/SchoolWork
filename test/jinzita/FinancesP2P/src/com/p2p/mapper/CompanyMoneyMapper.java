package com.p2p.mapper;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.CompanyMoney;

public interface CompanyMoneyMapper extends IBaseDao<Integer,CompanyMoney > {

	Integer getMoney(CompanyMoney companyMoney);
	
	
}
