package com.nstc.classloader;

public class Test {

	public static void main(String[] args) {
		ClassLoader c = Test.class.getClassLoader();
		while (c != null) {
			System.out.println(c.getClass().getName());
			c = c.getParent();
		}
	}
}
