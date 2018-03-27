package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Jurisdiction;

public interface JurisdictionMapper extends IBaseDao<Integer, Jurisdiction> {
	List<Jurisdiction> roleJur(int id);
	void updateAll(Integer id);
	void updateNeed(Integer role_id, Integer jur_id);
	void deleteRolejurByRid(Integer role_id);
	void addRolejurAllnoByRid(Integer role_id,Integer j_id);
	
	List<Jurisdiction> getRolejur(String str);//查询权限
}