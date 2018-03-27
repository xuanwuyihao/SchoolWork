package com.base;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<PK extends Serializable,T> {
	List<T> list();
	void save(T t);
	void update(T t);
	void remove(PK id);
	T getById(PK id);
}
