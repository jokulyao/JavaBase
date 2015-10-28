package com.nstc.pattern.factory.mutilFactoryMethod;

import com.nstc.pattern.factory.MailSender;
import com.nstc.pattern.factory.Sender;
import com.nstc.pattern.factory.SmsSender;

public class SenderFactory {
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
}
