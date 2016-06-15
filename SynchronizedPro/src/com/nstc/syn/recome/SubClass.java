package com.nstc.syn.recome;
/**
 * �������ǿ��������
 * @author yaoxs
 * 
 */
public class SubClass extends SupClass {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		subClass.get();
	}

	// ��������������
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
