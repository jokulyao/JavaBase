package com.nstc.pattern.structure.adapter.interfaceAdapter;

/**
 * 借助于Wrapper抽象类，该抽象类实现了Sourceable接口，实现了所有的方法，
 * 以后所有Sourceable接口的子类(SourceSub1、SourceSub2)都继承Wrapper抽象类，只和该抽象类取得联系
 * @author yaoxs
 */

public abstract class Wrapper implements Sourceable {

	@Override
	public void sourceableMethod1() {}

	@Override
	public void sourceableMethod2() {}
}
