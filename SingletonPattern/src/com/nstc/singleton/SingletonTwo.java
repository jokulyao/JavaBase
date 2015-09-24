package com.nstc.singleton;

/**
 * �������̰߳�ȫ
 * �ܹ��ڶ��߳��кܺõĹ��������ҿ�������Ҳ�߱��ܺõ�lazy loading��
 * ���ǣ��ź����ǣ�Ч�ʺܵͣ�99%����²���Ҫͬ��
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
