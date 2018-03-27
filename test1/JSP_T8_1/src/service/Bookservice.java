package service;

import java.util.List;

public interface Bookservice {
	public List list(int currpage,int pagecount);
	
	//查询总行数
	public int selrows();
}
