package com.nstc.pattern.behavior.memento;

import static org.junit.Assert.*;

import org.junit.Test;

public class MementoTest {

	@Test
	public void test() {

		// ����ԭʼ��
		Original origi = new Original("egg");

		// ��������¼
		Storage storage = new Storage(origi.createMemento());

		// �޸�ԭʼ���״̬
		System.out.println("��ʼ��״̬Ϊ��" + origi.getValue());
		origi.setValue("niu");
		System.out.println("�޸ĺ��״̬Ϊ��" + origi.getValue());

		// �ظ�ԭʼ���״̬
		origi.restoreMemento(storage.getMemento());
		System.out.println("�ָ����״̬Ϊ��" + origi.getValue());
	}
}
