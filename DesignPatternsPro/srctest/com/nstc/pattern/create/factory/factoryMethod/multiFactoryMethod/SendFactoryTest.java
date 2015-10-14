package com.nstc.pattern.create.factory.factoryMethod.multiFactoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.create.factory.Sender;
import com.nstc.pattern.create.factory.factoryMethod.multiFactoryMethod.SendFactory;

public class SendFactoryTest {

	@Test
	public void test() {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.Send();
	}
}
