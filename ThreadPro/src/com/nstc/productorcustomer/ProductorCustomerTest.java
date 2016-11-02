package com.nstc.productorcustomer;

import java.util.ArrayList;
import java.util.List;

/**
 * notify()和notifyAll()的区别
 * 解决假死的方法
 * @author yaoxs
 *
 */
public class ProductorCustomerTest {
	public static  void main(String[] args){
		MyStack myStack = new MyStack();
		Productor p1 = new Productor(myStack);
		Productor p2 = new Productor(myStack);
		Productor p3 = new Productor(myStack);
		Productor p4 = new Productor(myStack);
		Productor p5 = new Productor(myStack);
		Customer c1 = new Customer(myStack);
//		Customer c2 = new Customer(myStack);
//		Customer c3 = new Customer(myStack);
//		Customer c4 = new Customer(myStack);
//		Customer c5 = new Customer(myStack);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		
		c1.start();
//		c2.start();
//		c3.start();
//		c4.start();
//		c5.start();
	}
}

class MyStack {
	private List list = new ArrayList();
	
	public synchronized void push(){
		try{
			while(list.size() == 1) {
				System.out.println("push 操作中的:" + Thread.currentThread().getName() + " 线程呈wait状态");
				this.wait();
			}
			list.add("anyString=" + Math.random());
//			this.notify();
			this.notifyAll();
			System.out.println("push=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized String pop(){
		String returnValue = "";
		try {
			while(list.size() == 0){
				System.out.println("pop 操作中的:" + Thread.currentThread().getName() + " 线程呈wait状态");
				this.wait();
			}
			returnValue = "" + list.get(0);
			list.remove(0);
//			this.notify();
			this.notifyAll();
			System.out.println("pop=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}

class Productor extends Thread{
	private MyStack stack;
	
	public Productor(MyStack myStack){
		this.stack = myStack;
	}
	
	@Override
	public void run(){
		stack.push();
	}
}

class Customer extends Thread{
	private MyStack myStack;
	
	public Customer(MyStack myStack){
		this.myStack = myStack;
	}
	
	@Override
	public void run(){
		myStack.pop();
	}
}
