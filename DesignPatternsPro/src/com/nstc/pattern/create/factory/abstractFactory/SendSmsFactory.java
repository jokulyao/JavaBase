package com.nstc.pattern.create.factory.abstractFactory;

import com.nstc.pattern.create.factory.Sender;
import com.nstc.pattern.create.factory.SmsSender;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}
}