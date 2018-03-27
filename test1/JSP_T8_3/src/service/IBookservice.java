package service;

import java.util.List;

import bean.bookx;

public interface IBookservice {
	public List<bookx> prodlist();
	
	public int totalrow();
}
