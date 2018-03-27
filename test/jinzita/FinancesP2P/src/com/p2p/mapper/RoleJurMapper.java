package com.p2p.mapper;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.RoleJur;

public interface RoleJurMapper extends IBaseDao<Integer, RoleJur> {
   
	void addRoleJurFlast(Integer role_id,Integer j_id);
}