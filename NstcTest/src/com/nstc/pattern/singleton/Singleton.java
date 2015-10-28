package com.nstc.pattern.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Singleton(){
	}
	
	private static class SingletonFactory{
		private static Singleton singleton = new Singleton();
	}
	
	public static Singleton getInstance(){
		return SingletonFactory.singleton;
	}
	
	public Object readResolve(){
		return getInstance();
	}
}
