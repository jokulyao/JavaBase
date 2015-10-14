package com.nstc.pattern.create.factory.factoryMethod.multiFactoryMethod;

import com.nstc.pattern.create.factory.MailSender;
import com.nstc.pattern.create.factory.Sender;
import com.nstc.pattern.create.factory.SmsSender;

/**
 * 多个工厂方法模式(对普通工厂方法模式的改进)
 * 在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 * @author yaoxs
 */

public class SendFactory {

	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
