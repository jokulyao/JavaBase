package com.nstc.pattern.singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Singleton implements Serializable {
	
	private static final long serialVersionUID = 2026735363581704304L;

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
