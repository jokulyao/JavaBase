package com.nstc.syn.recome;
/**
 * 内置锁是可以重入的
 * @author yaoxs
 * 
 */
public class SubClass extends SupClass {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		subClass.get();
	}

	// 内置锁可以重入
	@Override
	public synchronized void get(){
		System.out.println("SubClass");
		super.get();
	}
}

class SupClass {
	public synchronized void get(){
		System.out.println("SupClass!!!");
	}
}
