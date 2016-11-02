package com.nstc.threadLocal;

import java.util.Date;

public class ThreadLocalTest {
	public static void main(String[] args){
		try {
			for(int i=0; i<10; i++){
				System.out.println(" 在Main线程中取值 = " + Tools.t1.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA a = new ThreadA();
			a.start();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}

class ThreadA extends Thread{
	@Override
	public void run(){
		try{
			for(int i=0; i<10; i++){
				System.out.println("在ThreadA线程中取值 =" + Tools.t1.get());
				if(i == 5){
					Tools.t1.set("AAAAAAAAAaa");
				}
				Thread.sleep(100);
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}

class Tools{
	public static ThreadLocalExt t1 = new ThreadLocalExt();
}

/**
 * 设置ThreadLocal的初始值
 * @author yaoxs
 *
 */
class ThreadLocalExt extends ThreadLocal{
	@Override
	protected Object initialValue(){
		return new Date().getTime();
	}
}