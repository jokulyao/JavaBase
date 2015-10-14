package com.nstc.classRelationship.dependence;

/**
 * 类Driver当中使用了类Car，其中类Car是作为类Driver的方法参数、方法中的局部变量、或者静态方法调用.
 * @author yaxos
 */

public class Driver {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive1(new Car());
		driver.drive2();
		driver.drive3();
	}
	
	// 使用形参方式发生依赖关系
	public void drive1(Car car) {
		car.run();
	}

	// 使用局部变量发生依赖关系
	public void drive2() {
		Car car = new Car();
		car.run();
	}

	// 使用静态变量发生依赖关系
	public void drive3() {
		Car.staticMethodRun();
	}
}