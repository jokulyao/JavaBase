package com.nstc.threadExceptionHandler.threadGroupExceptionHandler;

public class ThreadGroupExceptionHandler {
	public static void main(String[] args) {
		commonsThreadGroupTest();
//		myThreadGroupTest();
	}
	
	/**
	 * 1. Ĭ�ϵ��߳����е�һ���̳߳����쳣����Ӱ�������̵߳�����
	 */
	public static void commonsThreadGroupTest(){
		ThreadGroup group = new ThreadGroup("�ҵ��߳���");
		MyThread[] myThreads = new MyThread[10];
		for(int i=0; i<myThreads.length; i++){
			myThreads[i] = new MyThread(group, "�߳�" + (i+1), "1");
			myThreads[i].start();
		}
		MyThread newT = new MyThread(group, "�����߳�", "AS");
		newT.start();
	}
	
	/**
	 * 2. �Զ����߳���ʵ�� �߳�����һ���̳߳����쳣��ȫ���̶߳�ֹͣ����
	 */
	public static void myThreadGroupTest(){
		MyThreadGroup group = new MyThreadGroup("�ҵ��߳���");
		MyThreadTest[] myThreads = new MyThreadTest[10];
		for(int i=0; i<myThreads.length; i++){
			myThreads[i] = new MyThreadTest(group, "�߳�" + (i+1), "1");
			myThreads[i].start();
		}
		MyThread newT = new MyThread(group, "�����߳�", "AS");
		newT.start();
	}
}

class MyThread extends Thread{
	private String num;
	
	public MyThread(ThreadGroup threadGroup, String name, String num){
		super(threadGroup, name);
		this.num = num;
	}
	
	@Override
	public void run(){
		int numInt = Integer.parseInt(num);
		while(true){
			System.out.println("��ѭ���У�" + Thread.currentThread().getName());
		}
	}
}


class MyThreadGroup extends ThreadGroup{
	public MyThreadGroup(String name){
		super(name);
	}
	
	@Override
	public void uncaughtException(Thread t, Throwable e){
		super.uncaughtException(t, e);
		this.interrupt();
	}
}

class MyThreadTest extends Thread {
	private String num;
	
	public MyThreadTest(ThreadGroup threadGroup, String name, String num){
		super(threadGroup, name);
		this.num = num;
	}
	
	/**
	 * �̵߳�run()�����в�Ҫ���쳣catch���
	 * �����catch��䣬��public void uncaughtException(Thread t, Throwable e)������ִ��
	 */
	@Override
	public void run(){
		int numInt = Integer.parseInt(num);
		while(this.isInterrupted() == false){
			System.out.println("��ѭ���У�" + Thread.currentThread().getName());
		}
	}
}