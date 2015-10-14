package com.nstc.pattern.structure.proxy;

/**
 * 代理类
 * @author yaoxs
 */

public class Proxy implements Sourceable {
	
	private Source source;

	public Proxy() {
		super();
		// 个人感觉：代理模式(Proxy)与装饰模式(Decorator)的区别就在这
		// 装饰模式(Decorator)由外部传入对象
		// 代理模式(Proxy)自己new对象
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
