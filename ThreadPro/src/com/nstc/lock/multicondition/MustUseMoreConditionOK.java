package com.nstc.lock.multicondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ʹ�ö��Conditionʵ��֪ͨ�����߳�
 *
 */
public class MustUseMoreConditionOK {
	public static void main(String[] args) throws InterruptedException{
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		Thread.sleep(3000);
		service.signalAll_A();
	}
}

class ThreadA extends Thread {
	private MyService myService;
	
	public ThreadA(MyService service){
		this.myService = service;
	}
	
	@Override
	public void run(){
		myService.awaitA();
	}
}

class ThreadB extends Thread {
	private MyService myService;
	
	public ThreadB(MyService service){
		this.myService = service;
	}
	
	@Override
	public void run(){
		myService.awaitB();
	}
}

class MyService {
	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();
	
	public void awaitA(){
		try{
			lock.lock();
			System.out.println(" begin awaitAʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionA.await();
			System.out.println(" end awaitAʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void awaitB(){
		try{
			lock.lock();
			System.out.println(" begin awaitBʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionB.await();
			System.out.println(" end awaitBʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAll_A(){
		try{
			lock.lock();
			System.out.println(" signalAll_Aʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionA.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAll_B(){
		try{
			lock.lock();
			System.out.println(" signalAll_Bʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionA.signalAll();
		} finally {
			lock.unlock();
		}
	}
}