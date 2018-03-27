package com.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.bean.User;
import com.ht.mapper.UserMapper;
import com.method.MyBatisUtil;

public class SqlTest {

	   public void testInsertUser() { 
			SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
			SqlSession sqlSession = factory.openSession(); 	//����SqlSession
			User user = new User("С�鷿",21);
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class); 
			userMapper.insertUser(user); //�����û�
			sqlSession.commit(); //�ύ
			sqlSession.close();
	}
	   public void testSelectUsers(){
		   SqlSessionFactory factory=MyBatisUtil.getSqlSessionFactory();
		   SqlSession sqlsession=factory.openSession();
		   UserMapper usermapper=sqlsession.getMapper(UserMapper.class);
		   List<User> users=usermapper.selectAllUssers();
		   for(User user:users){
			   System.out.println(user.getName()+".."+user.getAge());
		   }
		   sqlsession.close();
	   }
	
	   public static void main(String[] args) throws IOException {
			SqlTest test = new SqlTest();
			//test.testInsertUser();
			test.testSelectUsers();
			
		}
}
