package com.nstc.pattern.factory.factoryMethod;

import com.nstc.pattern.factory.MailSender;
import com.nstc.pattern.factory.Sender;
import com.nstc.pattern.factory.SmsSender;

public class SenderFactory {
	
	public Sender produce(String str){
		if("mail".equals(str)){
			return new MailSender();
		}else if("sms".equals(str)){
			return new SmsSender();
		}
		return null;
	}
}
