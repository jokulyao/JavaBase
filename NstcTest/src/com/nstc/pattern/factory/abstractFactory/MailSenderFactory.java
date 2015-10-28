package com.nstc.pattern.factory.abstractFactory;

import com.nstc.pattern.factory.MailSender;
import com.nstc.pattern.factory.Sender;

public class MailSenderFactory implements SenderFactory {

	public Sender produce(){
		return new MailSender();
	}
}
