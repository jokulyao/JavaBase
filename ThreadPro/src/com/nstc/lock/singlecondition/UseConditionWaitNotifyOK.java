package com.nstc.lock.singlecondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * ��ȷʹ��Conditionʵ�ֵȴ�/֪ͨ
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
 * (1)Object���е�wait()�����൱��Condition���е�await()����
 * (2)Object���е�wait(long timeout)�����൱��Condition���е�await(long time, TimeUnit unit)����
 * (3)Object���е�notify()�����൱��Condition���е�signal()����
 * (4)Object���е�notifyAll()�����൱��Condition���е�signalAll()����
 */
class MyService{
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void await(){
		try{
			lock.lock();
			System.out.println(" awaitʱ��Ϊ" + System.currentTimeMillis());
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
			System.out.println("signalʱ��Ϊ" + System.currentTimeMillis());
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
}