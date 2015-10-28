package com.nstc.pattern.factory.mutilFactoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.factory.Sender;

public class SenderFactoryTest {

	@Test
	public void testProduce() {
		SenderFactory senderFactory = new SenderFactory();
		Sender sender = senderFactory.produceSms();
		sender.send();
	}

}
