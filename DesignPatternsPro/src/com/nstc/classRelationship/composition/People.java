package com.nstc.classRelationship.composition;

public class People {
	Soul soul;
	Body body;

	// ��Ϲ�ϵ�еĳ�Ա����һ����ڹ��췽���и�ֵ
	public People(Soul soul, Body body) {
		this.soul = soul;
		this.body = body;
	}

	public void study() {
		System.out.println("ѧϰҪ�����" + soul.toString());
	}

	public void eat() {
		System.out.println("�Է������壺" + body.toString());
	}
}