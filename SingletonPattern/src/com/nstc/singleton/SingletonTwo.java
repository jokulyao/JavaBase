package com.nstc.singleton;

/**
 * 懒汉，线程安全
 * 能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，
 * 但是，遗憾的是，效率很低，99%情况下不需要同步
 */
public class SingletonTwo {
	private static SingletonTwo instance;

	private SingletonTwo() {
	}

	public static synchronized SingletonTwo getInstance() {
		if (instance == null) {
			instance = new SingletonTwo();
		}
		return instance;
	}
}
