package com.p2p.commons;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao <PK extends Serializable, T> {
	List<T> list();
	void save(T t);
	void update(T t);
	void remove(PK id);
	T getById(PK id);
}
