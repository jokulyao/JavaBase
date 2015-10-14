package com.nstc.pattern.create.singleton;

/**
 * 因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字
 * 考虑性能的话，整个程序只需创建一次实例，所以性能也不会有什么影响
 * @author yaoxs
 */

public class SingletonOther {
	private static SingletonOther instance = null;

	private SingletonOther() {
	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new SingletonOther();
		}
	}

	public static SingletonOther getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}
}