package com.nstc.pattern.factory.abstractFactory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.factory.Sender;

public class SenderFactoryTest {

	@Test
	public void testProduce() {
		SenderFactory senderFactory = new MailSenderFactory();
		Sender sender = senderFactory.produce();
		sender.send();
	}

}
