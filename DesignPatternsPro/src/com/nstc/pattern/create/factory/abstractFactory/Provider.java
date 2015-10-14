package com.nstc.pattern.create.factory.abstractFactory;

import com.nstc.pattern.create.factory.Sender;

/**
 * 相较于工厂方法模式(FactoryMethodPattern),提供一个接口,创建多个工厂类
 * @author yaoxs
 */

public interface Provider {
	public Sender produce();
}