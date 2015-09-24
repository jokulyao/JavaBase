package com.nstc.singleton;

/**
 * ����
 * ����classloder���Ʊ����˶��̵߳�ͬ�����⣬
 * ������instance����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣�
 * �ڵ���ģʽ�д�������ǵ���getInstance������
 * ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ�
 * ��ʱ���ʼ��instance��Ȼû�дﵽlazy loading��Ч��
 */
public class SingletonThree {
	private static SingletonThree instance = new SingletonThree();

	private SingletonThree() {
	}

	public static SingletonThree getInstance() {
		return instance;
	}
}
