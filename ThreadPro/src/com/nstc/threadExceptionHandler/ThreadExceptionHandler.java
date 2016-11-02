package com.nstc.threadExceptionHandler;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadExceptionHandler {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("线程 t1");
		/**
		 * 1. setUncaughtExceptionHandler()作用是给 指定的线程对象 设置默认的异常处理器 
		 */
		t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("线程：" + t.getName() + " 出现了异常");
				e.printStackTrace();
			}
		});
		/**
		 * 2. 使用setDefaultUncaughtExceptionHandler()给MyThread类设置异常处理器
		 * 这样MyThread类所有的线程实例都是使用这个处理器处理异常
		 */
		/**
		MyThread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("线程：" + t.getName() + " 出现了异常");
				e.printStackTrace();
			}
		});
		*/
		t1.start();
		MyThread t2 = new MyThread();
		t2.setName("线程 t2");
		t2.start();
	}
	
}

class MyThread extends Thread{
	@Override
	public void run(){
		String userName = null;
		System.out.println(userName.hashCode());
	}
}