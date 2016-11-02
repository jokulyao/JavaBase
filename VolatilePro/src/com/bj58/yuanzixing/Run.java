package com.bj58.yuanzixing;

public class Run {
	public static void main(String[] args){
		MyThread[] mythreadArrray = new MyThread[100];
		for(int i=0; i<100; i++){
			mythreadArrray[i] = new MyThread();
		}
		for(int i=0; i<100; i++){
			mythreadArrray[i].start();
		}
	}
}

class MyThread extends Thread {
	public static int count;
	
	// 注意一定要添加static关键字
	// 这样synchronized与static锁的内容就是MyThread.class类了, 也就达到同步的效果了
	// 注意，如果添加了synchronized关键字,也就没有必要使用volatile了
	synchronized private static void addCount(){
		for(int i=0; i<100; i++){
			count++;
		}
		System.out.println("count = " + count);
	}
	
	@Override
	public void run(){
		addCount();
	}
}