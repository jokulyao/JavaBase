package com.nstc.reflect;

import java.io.Serializable;

public class Example {
	
}

class Person {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + this.name + "  " + this.age + "]";
	}

	private String name;
	private int age;
}

class Person2 implements Serializable {
	public Person2() {
	}

	public Person2(String name) {
		this.name = name;
	}

	public Person2(int age) {
		this.age = age;
	}

	public Person2(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "[" + this.name + "  " + this.age + "]";
	}

	private String name;
	private int age;
}