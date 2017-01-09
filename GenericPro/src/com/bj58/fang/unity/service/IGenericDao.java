package com.bj58.fang.unity.service;

import java.io.Serializable;

interface IGenericDao<T, ID extends Serializable> {
	T get(ID id);
}