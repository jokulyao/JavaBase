package com.nstc.pattern.create.factory.factoryMethod.staticFactoryMethod;

import com.nstc.pattern.create.factory.MailSender;
import com.nstc.pattern.create.factory.Sender;
import com.nstc.pattern.create.factory.SmsSender;

/**
 * ��̬��������ģʽ
 * ������Ķ����������ģʽ��ķ�����Ϊ��̬�ģ�����Ҫ����ʵ����ֱ�ӵ��ü��ɡ�
 * @author yaoxs
 */

public class SendFactory {

	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
