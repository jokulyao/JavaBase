package com.bj58.synchronizedkejianxing;

public class Run {
	public static void main(String[] args){
		try{
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
			System.out.println("已经发起停止的命令了！");			
		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}
}

class ThreadA extends Thread {
	private Service service;
	
	public ThreadA(Service service){
		this.service = service;
	}
	
	@Override
	public void run(){
		service.runMethod();
	}
}

class ThreadB extends Thread {
	private Service service;
	
	public ThreadB(Service service){
		this.service = service;
	}
	
	@Override
	public void run(){
		service.stopMethod();
	}
}


class Service {
	private boolean isContinueRun = true;
	
	public void runMethod(){
		String anyString = new String();
		while(isContinueRun == true){
			/**
			 * 这段synchronized代码可以保证 代码不出现问题
			 * 注释掉后悔死循环
			 * 证明synchronized代码块有volatile同步的功能 
			
			synchronized (anyString) {
			}
			 */
		}
		System.out.println("停下来了！");
	}
	
	public void stopMethod(){
		isContinueRun = false;
	}
	
}