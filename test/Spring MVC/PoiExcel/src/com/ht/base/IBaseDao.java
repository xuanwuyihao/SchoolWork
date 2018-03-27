package com.ht.base;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<PK extends Serializable,T >  {

	List<T> list();
	T getByid(PK id);
	void insert(T t);
	void update(T t);
	void delete(PK id);
}
