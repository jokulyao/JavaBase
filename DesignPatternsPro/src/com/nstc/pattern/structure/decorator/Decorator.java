package com.nstc.pattern.structure.decorator;

/**
 * װ����
 * @author yaoxs
 */

public class Decorator implements Sourceable {
	
	//װ�ζ�����б�װ�ζ����ʵ��
	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		// ���˸о�������ģʽ(Proxy)��װ��ģʽ(Decorator)�����������
		// װ��ģʽ(Decorator)���ⲿ�������
		// ����ģʽ(Proxy)�Լ�new����
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}
}