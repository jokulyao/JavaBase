package com.nstc.threadExceptionHandler;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadExceptionHandler {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("�߳� t1");
		/**
		 * 1. setUncaughtExceptionHandler()�����Ǹ� ָ�����̶߳��� ����Ĭ�ϵ��쳣������ 
		 */
		t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("�̣߳�" + t.getName() + " �������쳣");
				e.printStackTrace();
			}
		});
		/**
		 * 2. ʹ��setDefaultUncaughtExceptionHandler()��MyThread�������쳣������
		 * ����MyThread�����е��߳�ʵ������ʹ����������������쳣
		 */
		/**
		MyThread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("�̣߳�" + t.getName() + " �������쳣");
				e.printStackTrace();
			}
		});
		*/
		t1.start();
		MyThread t2 = new MyThread();
		t2.setName("�߳� t2");
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