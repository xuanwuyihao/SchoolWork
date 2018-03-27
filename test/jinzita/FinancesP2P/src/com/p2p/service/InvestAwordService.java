package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.InvestAword;
import com.p2p.pojo.Investpaging;
import com.p2p.pojo.Investseek;
import com.p2p.pojo.Paging;

public interface InvestAwordService extends IBaseDao<Integer, InvestAword> {
	List<InvestAword> seek(Investseek seek);
	//分页
	List<InvestAword> selpaging(Paging p);
	List<InvestAword> investpaging(Investpaging ip);
	
}
