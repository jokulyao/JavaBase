package com.bj58.fang.unity.service;
class DBHelper {
	public static <I> Object get(Class<?> clazz, I id) {
		Object bean = null;
		try {
			bean = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		if(String.class.getName().equals(bean.getClass().getName())){
			System.out.println("true");
			return id.toString();
		}
		System.out.println("false");
		return id;
	}
}