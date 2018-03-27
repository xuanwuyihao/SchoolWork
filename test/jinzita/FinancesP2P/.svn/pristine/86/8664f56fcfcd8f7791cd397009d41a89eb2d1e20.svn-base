package com.p2p.mapper;

import java.util.List;

import com.p2p.commons.IBaseDao;
import com.p2p.pojo.Notice;
import com.p2p.pojo.Page;
import com.p2p.pojo.User;

public interface UserMapper extends IBaseDao<Integer, User> {
	User selPhone(String phone);
	
	List<User> list2();
	Integer count();
	Integer pcount();

	List<User> selectlike(Page page);
	List<User> selectpeople(Page page);
	List<User> selectpaging(Page page);
	
	User getByPhoneName(User user);

	User getid(String userName);

	Integer getPhoneById(int id);

}