package com.p2p.mapper;


import java.util.List;


import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Manager;
import com.p2p.pojo.Page;

public interface ManagerMapper extends IBaseDao<Integer, Manager> {
    
	Manager getByName(String userName);
	//插入最后一次登录的时间和ip
	void insertLog(Manager manager);
	//模糊查询用户信息
	List<Manager> vagueSelect(Page page);
	
	//分页模糊查询用户信息
	List<Manager> vagueSelectLimit(Page page);
	
	//分页查询数据
	List<Manager> pagingSelect(Page pa);
}