package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.User;
import service.UseerService;

public class UserAction extends ActionSupport{
	private UseerService userService;
	private User user;
	private List<User> list;
	
	public UseerService getUserService() {
		return userService;
	}
	public void setUserService(UseerService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	
	public String list(){
		list=userService.list();
		for(User user:list){
			System.out.println("用户Id是："+user.getId()+"-----用户名是："+user.getName());
		}
		return SUCCESS;
	}

}
