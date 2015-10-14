package com.nstc.pattern.create.factory.abstractFactory;

import com.nstc.pattern.create.factory.MailSender;
import com.nstc.pattern.create.factory.Sender;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}
}