package com.bj58.fang.unity.service;


class UnityLocalDaoImpl extends GenericDao<String, Integer> {
	public static void main(String[] args) {
		GenericDao<String, Integer> genericDao = new UnityLocalDaoImpl();
		System.out.println(genericDao.get(1));
	}
}