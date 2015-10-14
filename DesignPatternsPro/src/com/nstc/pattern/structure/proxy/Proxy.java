package com.nstc.pattern.structure.proxy;

/**
 * ������
 * @author yaoxs
 */

public class Proxy implements Sourceable {
	
	private Source source;

	public Proxy() {
		super();
		// ���˸о�������ģʽ(Proxy)��װ��ģʽ(Decorator)�����������
		// װ��ģʽ(Decorator)���ⲿ�������
		// ����ģʽ(Proxy)�Լ�new����
		this.source = new Source();
	}

	@Override
	public void method() {
		before();
		source.method();
		atfer();
	}

	private void atfer() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}
}
