package com.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bean.User;

public class TestDemo {
	public static void main(String[] args) {
		//mybatis的配置文件
		String resource="mybatis-config,xml";
		//加载mybatis的配置文件
		InputStream is=TestDemo.class.getClassLoader().getResourceAsStream(resource);
		//构建sqlsession的工厂
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession();
		String statement="com.ht.mapping.userMapper.getUser";
		User user=session.selectOne(statement,1);
		System.out.println(user.getAge()+"..."+user.getName()+"..."+user.getId());
	}

}
