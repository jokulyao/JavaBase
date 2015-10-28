package com.nstc.pattern.factory.staticFactoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.factory.Sender;

public class SenderFactoryTest {

	@Test
	public void testProduce() {
		Sender sender = SenderFactory.produceMail();
		sender.send();
	}

}
