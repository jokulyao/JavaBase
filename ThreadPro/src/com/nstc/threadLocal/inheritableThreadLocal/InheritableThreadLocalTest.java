package com.nstc.threadLocal.inheritableThreadLocal;

import java.util.Date;

import com.nstc.threadLocal.inheritableThreadLocal.ThreadA;
import com.nstc.threadLocal.inheritableThreadLocal.Tools;

public class InheritableThreadLocalTest {
	public static void main(String[] args){
		try {
			for(int i=0; i<10; i++){
				System.out.println(" 在Main线程中取值 = " + Tools.t1.get());
				if(i == 5){
					Tools.t1.set("skksks");
				}
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
				if(i == 6){
					Tools.t1.set("bbbbbbb");
				}
				Thread.sleep(100);
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}

class Tools{
	public static InheritableThreadLocalExt t1 = new InheritableThreadLocalExt();
}

class InheritableThreadLocalExt extends InheritableThreadLocal{
	@Override
	protected Object initialValue(){
		return new Date().getTime();
	}
}