package com.nstc.pattern.create.factory.abstractFactory;

import com.nstc.pattern.create.factory.Sender;

/**
 * ����ڹ�������ģʽ(FactoryMethodPattern),�ṩһ���ӿ�,�������������
 * @author yaoxs
 */

public interface Provider {
	public Sender produce();
}