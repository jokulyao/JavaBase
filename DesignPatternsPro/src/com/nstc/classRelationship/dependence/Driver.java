package com.nstc.classRelationship.dependence;

/**
 * ��Driver����ʹ������Car��������Car����Ϊ��Driver�ķ��������������еľֲ����������߾�̬��������.
 * @author yaxos
 */

public class Driver {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive1(new Car());
		driver.drive2();
		driver.drive3();
	}
	
	// ʹ���βη�ʽ����������ϵ
	public void drive1(Car car) {
		car.run();
	}

	// ʹ�þֲ���������������ϵ
	public void drive2() {
		Car car = new Car();
		car.run();
	}

	// ʹ�þ�̬��������������ϵ
	public void drive3() {
		Car.staticMethodRun();
	}
}