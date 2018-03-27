package service;

import java.util.List;

import bean.Prod;

public interface IprodService {
	public List<Prod> prodlist(int pageCount,int currPage);
	
	public int totalrow();
}
