package com.nstc.singleton;
/**
 *	�������̲߳���ȫ
 *	д��lazy loading�����ԣ��������������ڶ��̲߳�����������
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
