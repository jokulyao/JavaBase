package com.nstc.pazzle;

/**
 * 此类为了说明instanceof和getClass之间的差别
 * 简而言之，instanceof判断对象的类及其父类及接口都是成立的；
 * getClass仅能返回对象的类，返回的值与其父类或接口是不等的。
 * @author yaoxs
 *
 */

public class InstanceofAndGetClass {
	public static void main(String[] args){
		Test test = new Test();
		test.test();
	}
}

class Test{
	class Parent {
	}

	class Child extends Parent {
	}

	Object o1 = new Parent();
	Object o2 = new Child();

	public void test() {
		System.out.println(o1 instanceof Parent); 		// => true
		System.out.println(o1 instanceof Child); 		// => false
		System.out.println(o2 instanceof Parent); 		// => true(here) instanceof
		System.out.println(o2 instanceof Child); 		// => true

		System.out.println();

		// getClass() will be useful when you want to make sure your instance is
		// NOT a subclass of the class you are comparing with.
		System.out.println(o1.getClass().equals(Parent.class)); 	// => true
		System.out.println(o1.getClass().equals(Child.class)); 		// => false
		System.out.println(o2.getClass().equals(Parent.class)); 	// => false(here)
		System.out.println(o2.getClass().equals(Child.class)); 		// => true
	}
}