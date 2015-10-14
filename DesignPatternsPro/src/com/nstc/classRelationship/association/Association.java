package com.nstc.classRelationship.association;

public class Association {
	
}

class Father {
	// 关联关系中作为成员变量的类一般会在类中赋值
	Son son = new Son();

	public void giveGift() {
		System.out.println("送给" + son.toString() + "礼物");
	}
}

class Son {
	// 关联关系中作为成员变量的类一般会在类中赋值
	Father father = new Father();

	public void getGift() {
		System.out.println("从" + father.toString() + "获得礼物");
	}
}