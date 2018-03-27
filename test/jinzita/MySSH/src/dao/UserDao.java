package dao;

import java.util.List;

import model.User;

public interface UserDao {
	public void add(User user);
	public void update(User user);
	public void delete(User user);
	public List<User> getlisr();

}
