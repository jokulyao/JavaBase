package com.nstc.pattern.create.factory.factoryMethod.staticFactoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.create.factory.Sender;
import com.nstc.pattern.create.factory.factoryMethod.staticFactoryMethod.SendFactory;

public class SenderFactoryTest {

	@Test
	public void test() {
		//��̬��������ģʽ������Ҫ����SendFactory��ʵ��
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
