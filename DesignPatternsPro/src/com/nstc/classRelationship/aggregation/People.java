package com.nstc.classRelationship.aggregation;

public class People {
	private Car car;
	private House house;

	// �ۺϹ�ϵ����Ϊ��Ա��������һ��ʹ��set������ֵ
	public void setCar(Car car) {
		this.car = car;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public void driver() {
		System.out.println("�����ͺţ�" + car.toString());
	}

	public void sleep() {
		System.out.println("���ڷ�����˯����" + house.toString());
	}
}