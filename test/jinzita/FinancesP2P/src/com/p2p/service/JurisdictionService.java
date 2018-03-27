package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.Jurisdiction;

public interface JurisdictionService extends IBaseService<Integer, Jurisdiction> {
 
	List<Jurisdiction> getRolejur(String str);//查询权限
}
