package com.p2p.service;


import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.Jurisdiction;
import com.p2p.pojo.Manager;
import com.p2p.pojo.Page;
import com.p2p.pojo.Role;

public interface ManagerService extends IBaseService<Integer, Manager>{	
	Manager getByName(String userName);
	//用户角色与权限
	List<Role> roleList();
	List<Jurisdiction> roleJur(int id);
	void updateAll(Integer id);
	void updateNeed(Integer role_id, Integer jur_id);
	void deleteRole(Integer id);
	void deleteRolejurByRid(Integer role_id);
	void addRole(Role role);
	Integer getRoleMaxId();
	void addRolejurAllnoByRid(Integer role_id,Integer j_id);
	
	//插入最后一次登录的时间和ip
	void insertLog(Manager manager);
	
	//模糊查询用户信息
	List<Manager> vagueSelect(Page page);
	
	//分页模糊查询用户信息
	List<Manager> vagueSelectLimit(Page page);
	
	//分页查询数据
	List<Manager> pagingSelect(Page pa);
	
}
