package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.UserDao;
import com.model.User;

public class UserDaoImpl implements UserDao{
	private HibernateTemplate hibernatetemplate;
	private Session session;

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		hibernatetemplate.save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		hibernatetemplate.update(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		hibernatetemplate.delete(id);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		List<User> list=hibernatetemplate.find("from userd");
		return list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		session=hibernatetemplate.getSessionFactory().openSession();
		String sql="select count(*) from userd";
		int count=((Number)session.createQuery(sql).uniqueResult()).intValue();
		return count;
	}

	@Override
	public List<User> getSelect(int firstCount, int total) {
		// TODO Auto-generated method stub
		session= hibernatetemplate.getSessionFactory().openSession();
		List<User> list=session.createQuery("from userd").setFirstResult((firstCount-1)*total).setMaxResults(total).list();
		return list;
	}

}
