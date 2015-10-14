package com.nstc.classRelationship.aggregation;

public class People {
	private Car car;
	private House house;

	// 聚合关系中作为成员变量的类一般使用set方法赋值
	public void setCar(Car car) {
		this.car = car;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public void driver() {
		System.out.println("车的型号：" + car.toString());
	}

	public void sleep() {
		System.out.println("我在房子里睡觉：" + house.toString());
	}
}