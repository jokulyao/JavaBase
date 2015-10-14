package com.nstc.pattern.create.factory.factoryMethod.simpleFactory;

import com.nstc.pattern.create.factory.MailSender;
import com.nstc.pattern.create.factory.Sender;
import com.nstc.pattern.create.factory.SmsSender;

/**
 * ��ͨ����ģʽ(SimpleFactoryPattern)
 * ���ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
 * @author yaoxs
 */

public class SendFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("��������ȷ������!");
			return null;
		}
	}
}