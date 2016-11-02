package com.nstc.waitAndNotify;
/**
 * 必须执行完notify()方法所在的同步synchronized代码块后才释放锁
 * 
 * @author yaoxs
 *
 */
public class WaitNotify {
	public static void main(String[] args){
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();
		SynNotifyMetodThread c = new SynNotifyMetodThread(lock);
		c.start();
	}
}

class ThreadA extends Thread {
	private Object lock;
	
	public ThreadA (Object lock){
		this.lock = lock;
	}
	
	@Override
	public void run(){
		Service service = new Service();
		service.testMethod(lock);
	}
}

class NotifyThread extends Thread {
	private Object lock;
	
	public NotifyThread (Object lock){
		this.lock = lock;
	}
	
	@Override
	public void run(){
		Service service = new Service();
		service.synNotifyMethod(lock);
	}
}

class SynNotifyMetodThread extends Thread {
	private Object lock;
	
	public SynNotifyMetodThread(Object lock){
		this.lock = lock;
	}
	
	@Override
	public void run(){
		Service service = new Service();
		service.synNotifyMethod(lock);
	}
}

class Service {
	public void testMethod(Object lock){
		try {
			synchronized (lock) {
				System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
				lock.wait();
				System.out.println(" end wait() ThreadName=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void synNotifyMethod(Object lock){
		try {
			synchronized (lock) {
				System.out.println("begin notify() ThreadName=" + Thread.currentThread().getName() 
						+ " time=" + System.currentTimeMillis());
				lock.notify();
				Thread.sleep(5000);
				System.out.println(" end notify() ThreadName=" + Thread.currentThread().getName()
						+ " time=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}

