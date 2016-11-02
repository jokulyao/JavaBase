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
	
	// ע��һ��Ҫ���static�ؼ���
	// ����synchronized��static�������ݾ���MyThread.class����, Ҳ�ʹﵽͬ����Ч����
	// ע�⣬��������synchronized�ؼ���,Ҳ��û�б�Ҫʹ��volatile��
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