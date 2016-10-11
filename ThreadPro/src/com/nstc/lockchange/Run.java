package com.nstc.lockchange;

public class Run {

	public static void main(String[] args){
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		a.start();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.start();
	}
}

class ThreadA extends Thread {
	private MyService service;
	
	public ThreadA(MyService service){
		this.service = service;
	}
	
	@Override
	public void run() {
		service.testMethod();
	}
}

class ThreadB extends Thread {
	private MyService service;
	
	public ThreadB(MyService service){
		this.service = service;
	}
	
	@Override
	public void run() {
		service.testMethod();
	}
}

/**
 * lock 地址变化了
 * @author yaoxs
 *
 */
class MyService {
	private String lock = "123";
	
	public void testMethod() {
		try {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
				lock = "456";
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
