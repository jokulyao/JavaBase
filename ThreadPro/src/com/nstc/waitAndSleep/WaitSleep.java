package com.nstc.waitAndSleep;

public class WaitSleep {
	public static void main(String[] args){
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();
		ThreadB b = new ThreadB(lock);
		b.start();
	}
}

class ThreadA extends Thread {
	private Object lock;
	
	public ThreadA(Object lock){
		this.lock = lock;
	}
	
	@Override
	public void run(){
		Service service = new Service();
		service.testMethod(lock);
	}
}

class ThreadB extends Thread {
	private Object lock;
	
	public ThreadB(Object lock){
		this.lock = lock;
	}
	
	@Override
	public void run(){
		Service service = new Service();
		service.testMethod(lock);
	}
}

/**
 * wait() Õ∑≈À¯
 * sleep()≤ª Õ∑≈À¯
 * 
 * @author yaoxs
 *
 */
class Service {
	public void testMethod(Object lock){
		try {
			synchronized (lock) {
				System.out.println("begin wait!!!");
//				lock.wait();
				Thread.sleep(10000);
				System.out.println(" end wait!!!");
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}