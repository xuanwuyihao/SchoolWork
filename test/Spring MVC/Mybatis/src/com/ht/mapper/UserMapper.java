package com.ht.mapper;

import java.util.List;

import com.bean.User;

public interface UserMapper {
	//�����û�
	public void insertUser(User user);
	//����id��ѯ
	public void getUser(User user);
	//��ѯȫ��
	public List<User> selectAllUssers();
}
