package service;

import java.util.List;

public interface Bookservice {
	public List list(int currpage,int pagecount);
	
	//��ѯ������
	public int selrows();
}
