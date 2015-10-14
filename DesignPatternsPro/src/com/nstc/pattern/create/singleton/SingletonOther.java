package com.nstc.pattern.create.singleton;

/**
 * ��Ϊ����ֻ��Ҫ�ڴ������ʱ�����ͬ��������ֻҪ��������getInstance()�ֿ�������Ϊ������synchronized�ؼ���
 * �������ܵĻ�����������ֻ�贴��һ��ʵ������������Ҳ������ʲôӰ��
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