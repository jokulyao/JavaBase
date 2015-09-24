package com.nstc.singleton;

/**
 * ˫��У����
 * �ǵڶ��ַ�ʽ�������棬�׳�˫�ؼ������
 * һ�㵥����������д�����������񺺣�˫��У������ö�ٺ;�̬�ڲ��ࡣ
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
