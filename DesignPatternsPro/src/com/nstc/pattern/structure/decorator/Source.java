package com.nstc.pattern.structure.decorator;

/**
 * ��װ����(��Ҫʵ��Sourceable�ӿ�)
 * @author yaoxs
 */

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}
}