package com.nstc.pattern.structure.decorator;

/**
 * 被装饰类(需要实现Sourceable接口)
 * @author yaoxs
 */

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}
}