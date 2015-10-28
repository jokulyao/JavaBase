package com.nstc.pattern.singleton;

import java.io.Serializable;

public class SingletonOther implements Serializable{

	private static final long serialVersionUID = -9112527335014828987L;
	
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
