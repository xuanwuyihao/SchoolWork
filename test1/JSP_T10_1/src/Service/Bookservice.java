package Service;

import java.util.List;

import Bean.Bean;
import Bean.User;

public interface Bookservice {
	public List Boooklist(int currpage,int pagecount);
	
	//总行数
	public int Bookrows();
	
	//添加
	public boolean bookadd(Bean b);
	
	//修改
	public boolean bookupd(Bean b);
	
	//删除
	public boolean bookdel(int id);
	
	public Bean selbyid(int id);
	
	//登录逻辑
	public User login(User user);
}
