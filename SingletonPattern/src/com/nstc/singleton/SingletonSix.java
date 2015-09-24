package com.nstc.singleton;

/**
 * 双重校验锁
 * 是第二种方式的升级版，俗称双重检查锁定
 * 一般单例都是五种写法。懒汉，恶汉，双重校验锁，枚举和静态内部类。
 */
public class SingletonSix {
	private volatile static SingletonSix singleton;

	private SingletonSix() {
	}

	public static SingletonSix getSingleton() {
		if (singleton == null) {
			synchronized (SingletonSix.class) {
				if (singleton == null) {
					singleton = new SingletonSix();
				}
			}
		}
		return singleton;
	}
}
