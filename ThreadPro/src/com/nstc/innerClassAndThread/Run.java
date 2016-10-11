package com.nstc.innerClassAndThread;

import com.nstc.innerClassAndThread.OutClass.InnerClass1;
import com.nstc.innerClassAndThread.OutClass.InnerClass2;

public class Run {
	public static void main(String[] args){
		final InnerClass1 inner1 = new InnerClass1();
		final InnerClass2 inner2 = new InnerClass2();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				inner1.Inner1Method1(inner2);
			}
		}, "T1");
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				inner1.Inner1Method2();
			}
		}, "T2");
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				inner2.Inner2Method1();
			}
		}, "T3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}


class OutClass{
	static class InnerClass1 {
		public void Inner1Method1(InnerClass2 class2){
			String threadName = Thread.currentThread().getName();
			synchronized (class2) {
				System.out.println(threadName + " ����InnerClass1���е�Inner1Method1����");
				for(int i=0; i < 10; i++){
					System.out.println("i=" + i);
					try{
						Thread.sleep(100);
					}catch(InterruptedException e){
						
					}
				}
				System.out.println(threadName + " �뿪InnerClass1���е�Inner1Method1����");
			}
		}
		
		public synchronized void Inner1Method2() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " ����InnerClass1���е�Inner1Method2����");
			for(int j=0; j < 10; j++){
				System.out.println("j=" + j);
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){
					
				}
			}
			System.out.println(threadName + " �뿪InnerClass1���е�Inner1Method2����");
		}
	}
	
	static class InnerClass2 {
		public synchronized void Inner2Method1() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " ����InnerClass2���е�Inner2Method1����");
			for(int k=0; k < 10; k++){
				System.out.println("k=" + k);
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){
					
				}
			}
			System.out.println(threadName + " �뿪InnerClass2���е�Inner2Method1����");
		}
	}
}