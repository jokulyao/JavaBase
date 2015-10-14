package com.nstc.classRelationship.composition;

public class People {
	Soul soul;
	Body body;

	// 组合关系中的成员变量一般会在构造方法中赋值
	public People(Soul soul, Body body) {
		this.soul = soul;
		this.body = body;
	}

	public void study() {
		System.out.println("学习要用灵魂" + soul.toString());
	}

	public void eat() {
		System.out.println("吃饭用身体：" + body.toString());
	}
}