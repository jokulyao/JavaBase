package com.nstc.pattern.create.factory.factoryMethod.multiFactoryMethod;

import com.nstc.pattern.create.factory.MailSender;
import com.nstc.pattern.create.factory.Sender;
import com.nstc.pattern.create.factory.SmsSender;

/**
 * �����������ģʽ(����ͨ��������ģʽ�ĸĽ�)
 * ����ͨ��������ģʽ�У�������ݵ��ַ�������������ȷ�������󣬶������������ģʽ���ṩ��������������ֱ𴴽�����
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
