package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.UserDao;
import model.User;

public class UserDaoImpl implements UserDao{
	private HibernateTemplate hibernateTemplate;
	
	
	

	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void sava(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detale(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		List<User> list=hibernateTemplate.find("from User");
		
		return list;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
