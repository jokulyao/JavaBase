package com.nstc.pattern.factory.staticFactoryMethod;

import com.nstc.pattern.factory.MailSender;
import com.nstc.pattern.factory.Sender;
import com.nstc.pattern.factory.SmsSender;

public class SenderFactory {

	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
