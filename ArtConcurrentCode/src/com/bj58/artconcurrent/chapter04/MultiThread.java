package com.bj58.artconcurrent.chapter04;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 6-1
 */
public class MultiThread {

	public static void main(String[] args) {
		// ��ȡJava�̹߳���MXBean
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		// ����Ҫ��ȡͬ����monitor��synchronizer��Ϣ��������ȡ�̺߳��̶߳�ջ��Ϣ
		ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
		// �����߳���Ϣ������ӡ�߳�ID���߳�������Ϣ
		for (ThreadInfo threadInfo : threadInfos) {
			System.out.println("[" + threadInfo.getThreadId() + "] "
					+ threadInfo.getThreadName());
		}
		
		MyThread myThread = new MyThread();
		myThread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main");
	}
}

class MyThread extends Thread{
	@Override
	public void run(){
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("AAAa");
	}
}
