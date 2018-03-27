package com.p2p.service;

import java.util.List;

import com.p2p.commons.IBaseService;
import com.p2p.pojo.Notice;
import com.p2p.pojo.Page;
import com.p2p.pojo.User;

public interface UserService  extends IBaseService<Integer, User>{
      
	User selPhone(String phone);
	
	List<User> list2();
	Integer count();
	Integer pcount();
//	List<User> selectlike(User user);
//	List<User> selectpeople(User user);
//	List<User> selectpaging(User user);
	
	List<User> selectlike(Page page);
	List<User> selectpeople(Page page);
	List<User> selectpaging(Page page);
	User getByPhoneName(User u);
	
	Integer getPhoneById(int id);
	
	User getid(String userName);
}
