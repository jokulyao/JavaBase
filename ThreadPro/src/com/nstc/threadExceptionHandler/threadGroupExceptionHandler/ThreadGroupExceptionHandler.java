package com.nstc.threadExceptionHandler.threadGroupExceptionHandler;

public class ThreadGroupExceptionHandler {
	public static void main(String[] args) {
		commonsThreadGroupTest();
//		myThreadGroupTest();
	}
	
	/**
	 * 1. 默认的线程组中的一个线程出现异常不会影响其他线程的运行
	 */
	public static void commonsThreadGroupTest(){
		ThreadGroup group = new ThreadGroup("我的线程组");
		MyThread[] myThreads = new MyThread[10];
		for(int i=0; i<myThreads.length; i++){
			myThreads[i] = new MyThread(group, "线程" + (i+1), "1");
			myThreads[i].start();
		}
		MyThread newT = new MyThread(group, "报错线程", "AS");
		newT.start();
	}
	
	/**
	 * 2. 自定义线程组实现 线程组内一个线程出现异常后全部线程都停止运行
	 */
	public static void myThreadGroupTest(){
		MyThreadGroup group = new MyThreadGroup("我的线程组");
		MyThreadTest[] myThreads = new MyThreadTest[10];
		for(int i=0; i<myThreads.length; i++){
			myThreads[i] = new MyThreadTest(group, "线程" + (i+1), "1");
			myThreads[i].start();
		}
		MyThread newT = new MyThread(group, "报错线程", "AS");
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
			System.out.println("死循环中：" + Thread.currentThread().getName());
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
	 * 线程的run()方法中不要有异常catch语句
	 * 如果有catch语句，则public void uncaughtException(Thread t, Throwable e)方法不执行
	 */
	@Override
	public void run(){
		int numInt = Integer.parseInt(num);
		while(this.isInterrupted() == false){
			System.out.println("死循环中：" + Thread.currentThread().getName());
		}
	}
}