package com.bj58.fang.unity.service;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

class GenericDao<T, ID extends Serializable> implements IGenericDao<T, ID>{
	protected Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	protected final Class<T> getEntityClass() {
		if (entityClass == null) {
			entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		}
		return entityClass;
	}
	
	@SuppressWarnings("unchecked")
	public T get(ID id){
		return (T) DBHelper.get(getEntityClass(), id);
	}
}