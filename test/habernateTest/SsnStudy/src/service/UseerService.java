package service;

import java.util.List;

import model.User;

public interface UseerService {

	public abstract void sava(User user);
	public abstract void update(User user);
	public abstract void delete(User user);
	public abstract void detale(User user);
	public abstract List<User> list();
	public abstract User get(int id);
}
