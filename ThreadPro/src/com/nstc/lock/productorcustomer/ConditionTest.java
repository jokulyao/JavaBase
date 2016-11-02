package com.nstc.lock.productorcustomer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者-消费者：一对一交替打印
 *
 */
public class ConditionTest {
	public static void main(String[] args){
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}

class ThreadA extends Thread {
	private MyService myService;
	
	public ThreadA(MyService service){
		this.myService = service;
	}
	
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			myService.set();
		}
	}
}

class ThreadB extends Thread {
	private MyService myService;
	
	public ThreadB(MyService service){
		this.myService = service;
	}
	
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			myService.get();
		}
	}
}

class MyService {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;
	
	public void set(){
		try{
			lock.lock();
			while(hasValue == true){
				condition.await();
			}
			System.out.println("打印");
			hasValue = true;
			condition.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void get(){
		try{
			lock.lock();
			while(hasValue == false){
				condition.await();
			}
			System.out.println("   打印");
			hasValue = false;
			condition.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
}