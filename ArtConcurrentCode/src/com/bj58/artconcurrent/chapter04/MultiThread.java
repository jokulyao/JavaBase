package com.bj58.artconcurrent.chapter04;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 6-1
 */
public class MultiThread {

	public static void main(String[] args) {
		// 获取Java线程管理MXBean
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		// 不需要获取同步的monitor和synchronizer信息，仅仅获取线程和线程堆栈信息
		ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
		// 遍历线程信息，仅打印线程ID和线程名称信息
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
