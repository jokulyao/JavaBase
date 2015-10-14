package com.nstc.pattern.structure.decorator;

/**
 * 装饰类
 * @author yaoxs
 */

public class Decorator implements Sourceable {
	
	//装饰对象持有被装饰对象的实例
	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		// 个人感觉：代理模式(Proxy)与装饰模式(Decorator)的区别就在这
		// 装饰模式(Decorator)由外部传入对象
		// 代理模式(Proxy)自己new对象
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}
}