package com.nstc.lock.productorcustomer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 *
 */
public class ConditionTestMany2Many {
	public static void main(String[] args){
		MyServiceMulti service = new MyServiceMulti();
		MultiThreadA[] threadA = new MultiThreadA[10];
		MultiThreadB[] threadB = new MultiThreadB[10];
		for(int i=0; i<10; i++){
			threadA[i] = new MultiThreadA(service);
			threadB[i] = new MultiThreadB(service);
			threadA[i].start();
			threadB[i].start();
		}
	}
}


class MultiThreadA extends Thread {
	private MyServiceMulti myService;
	
	public MultiThreadA(MyServiceMulti service){
		this.myService = service;
	}
	
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			myService.set();
		}
	}
}

class MultiThreadB extends Thread {
	private MyServiceMulti myService;
	
	public MultiThreadB(MyServiceMulti service){
		this.myService = service;
	}
	
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			myService.get();
		}
	}
}

class MyServiceMulti {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;
	
	public void set(){
		try{
			lock.lock();
			while(hasValue == true){
				System.out.println("有可能**连续");
				condition.await();
			}
			System.out.println("打印*");
			hasValue = true;
			condition.signalAll();
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
				System.out.println("有可能--连续");
				condition.await();
			}
			System.out.println("   打印-");
			hasValue = false;
			condition.signalAll();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
}