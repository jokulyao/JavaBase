package com.nstc.pattern.factory.abstractFactory;

import com.nstc.pattern.factory.Sender;
import com.nstc.pattern.factory.SmsSender;

public class SmsSenderFactory implements SenderFactory {

	public Sender produce(){
		return new SmsSender();
	}
}
