package com.nstc.classRelationship.association;

public class Association {
	
}

class Father {
	// ������ϵ����Ϊ��Ա��������һ��������и�ֵ
	Son son = new Son();

	public void giveGift() {
		System.out.println("�͸�" + son.toString() + "����");
	}
}

class Son {
	// ������ϵ����Ϊ��Ա��������һ��������и�ֵ
	Father father = new Father();

	public void getGift() {
		System.out.println("��" + father.toString() + "�������");
	}
}