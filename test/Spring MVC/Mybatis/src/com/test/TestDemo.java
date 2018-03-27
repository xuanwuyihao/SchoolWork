package com.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bean.User;

public class TestDemo {
	public static void main(String[] args) {
		//mybatis�������ļ�
		String resource="mybatis-config,xml";
		//����mybatis�������ļ�
		InputStream is=TestDemo.class.getClassLoader().getResourceAsStream(resource);
		//����sqlsession�Ĺ���
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession();
		String statement="com.ht.mapping.userMapper.getUser";
		User user=session.selectOne(statement,1);
		System.out.println(user.getAge()+"..."+user.getName()+"..."+user.getId());
	}

}
