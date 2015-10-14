package com.nstc.pattern.create.factory.factoryMethod.staticFactoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.create.factory.Sender;
import com.nstc.pattern.create.factory.factoryMethod.staticFactoryMethod.SendFactory;

public class SenderFactoryTest {

	@Test
	public void test() {
		//静态工厂方法模式，不需要创建SendFactory的实例
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
