package com.nstc.pattern.create.factory.factoryMethod.simpleFactory;

import com.nstc.pattern.create.factory.MailSender;
import com.nstc.pattern.create.factory.Sender;
import com.nstc.pattern.create.factory.SmsSender;

/**
 * 普通工厂模式(SimpleFactoryPattern)
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * @author yaoxs
 */

public class SendFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}