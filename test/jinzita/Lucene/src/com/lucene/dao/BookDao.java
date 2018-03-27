package com.lucene.dao;

import java.util.List;

import com.lucene.po.Book;

public interface BookDao {
	public List<Book> queryBooks();

}
