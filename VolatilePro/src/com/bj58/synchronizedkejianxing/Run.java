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
			System.out.println("�Ѿ�����ֹͣ�������ˣ�");			
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
			 * ���synchronized������Ա�֤ ���벻��������
			 * ע�͵������ѭ��
			 * ֤��synchronized�������volatileͬ���Ĺ��� 
			
			synchronized (anyString) {
			}
			 */
		}
		System.out.println("ͣ�����ˣ�");
	}
	
	public void stopMethod(){
		isContinueRun = false;
	}
	
}