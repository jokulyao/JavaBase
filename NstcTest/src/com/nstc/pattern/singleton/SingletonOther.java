package com.nstc.pattern.singleton;

public class SingletonOther {

	private static SingletonOther instance = null;
	
	private SingletonOther(){
		
	}
	
	public static SingletonOther getInstance(){
		if(instance == null){
			init();
		}
		return instance;
	}
	
	private static synchronized void init(){
		if(instance == null){
			instance = new SingletonOther();
		}
	}
}
