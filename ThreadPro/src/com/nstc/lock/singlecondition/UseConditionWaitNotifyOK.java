package com.nstc.lock.singlecondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 正确使用Condition实现等待/通知
 * @author yaoxs
 *
 */
public class UseConditionWaitNotifyOK {
	public static void main(String[] args) throws InterruptedException{
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
		Thread.sleep(3000);
		service.signal();
	}
}

class ThreadA extends Thread {
	private MyService myService;
	
	public ThreadA(MyService service){
		this.myService = service;
	}
	
	@Override
	public void run(){
		myService.await();
	}
}

/**
 * (1)Object类中的wait()方法相当于Condition类中的await()方法
 * (2)Object类中的wait(long timeout)方法相当于Condition类中的await(long time, TimeUnit unit)方法
 * (3)Object类中的notify()方法相当于Condition类中的signal()方法
 * (4)Object类中的notifyAll()方法相当于Condition类中的signalAll()方法
 */
class MyService{
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void await(){
		try{
			lock.lock();
			System.out.println(" await时间为" + System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signal(){
		try{
			lock.lock();
			System.out.println("signal时间为" + System.currentTimeMillis());
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
}