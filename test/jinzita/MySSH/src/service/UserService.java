package service;

import java.util.List;

import model.User;

public interface UserService {
	public void add(User user);
	public void update(User user);
	public void delete(User user);
	public List<User> getlisr();


}
