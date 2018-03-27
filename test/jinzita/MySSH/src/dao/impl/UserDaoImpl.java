package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.UserDao;
import model.User;

public class UserDaoImpl implements UserDao{
	private HibernateTemplate ht;

	public void add(User user) {
		// TODO Auto-generated method stub
		ht.save(user);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		ht.update(user);
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		ht.delete(user);
	}

	public List<User> getlisr() {
		// TODO Auto-generated method stub
		List<User> list=ht.find("from User");
		return list;
	}

}
