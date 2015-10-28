package com.nstc.pattern.factory.abstractFactory;

import com.nstc.pattern.factory.MailSender;
import com.nstc.pattern.factory.Sender;
import com.nstc.pattern.factory.SmsSender;

public interface SenderFactory {
	public Sender produce();
}
