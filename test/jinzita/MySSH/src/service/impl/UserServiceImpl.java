package service.impl;

import java.util.List;

import dao.UserDao;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userdao;

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public void add(User user) {
		// TODO Auto-generated method stub
		userdao.add(user);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		userdao.update(user);
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		userdao.delete(user);
	}

	public List<User> getlisr() {
		// TODO Auto-generated method stub
		return userdao.getlisr();
	}

}
