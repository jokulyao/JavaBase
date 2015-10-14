package com.nstc.pattern.create.factory.abstractFactory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.create.factory.Sender;
import com.nstc.pattern.create.factory.abstractFactory.Provider;
import com.nstc.pattern.create.factory.abstractFactory.SendMailFactory;

public class ProviderTest {

	@Test
	public void test() {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
