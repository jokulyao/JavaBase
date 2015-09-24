package com.nstc.singleton;
/**
 *	懒汉，线程不安全
 *	写法lazy loading很明显，但是致命的是在多线程不能正常工作
 */
public class SingletonOne {
	private static SingletonOne instance;

	private SingletonOne() {
	}

	public static SingletonOne getInstance() {
		if (instance == null) {
			instance = new SingletonOne();
		}
		return instance;
	}
}
