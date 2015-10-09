package com.nstc.pazzle;

/**
 * ����Ϊ��˵��instanceof��getClass֮��Ĳ��
 * �����֮��instanceof�ж϶�����༰�丸�༰�ӿڶ��ǳ����ģ�
 * getClass���ܷ��ض�����࣬���ص�ֵ���丸���ӿ��ǲ��ȵġ�
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