package com.lucene.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.lucene.dao.BookDao;
import com.lucene.po.Book;

public class BookDaoImpl implements BookDao {

	@Override
	public List<Book> queryBooks() {
		//数据库连接
		Connection connection=null;
		
		//预编译statemet
		PreparedStatement preparedStatement=null;
		
		//结果集
		ResultSet resultSet=null;
		
		//图书列表
		List<Book> list=new ArrayList<Book>();
		
		
		try {
			//加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//连接数据库
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","0628");
			
			//sql语句
			String sql="select * from book";
			
			//创建preparedstatement
			preparedStatement=connection.prepareStatement(sql);
			
			//获取结果集
			resultSet=preparedStatement.executeQuery();
			
			//结果集解析
			while(resultSet.next()) {
				Book book=new Book();
				book.setId(resultSet.getInt("id"));
				book.setName(resultSet.getString("name"));
				book.setPic(resultSet.getString("pic"));
				book.setPrice(resultSet.getFloat("price"));
				book.setDescription(resultSet.getString("description"));
				list.add(book);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
