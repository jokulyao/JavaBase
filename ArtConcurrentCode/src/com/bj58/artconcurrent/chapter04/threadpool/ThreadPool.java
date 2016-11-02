package com.bj58.artconcurrent.chapter04.threadpool;

public interface ThreadPool<Job extends Runnable> {
	
	public void execute(Job job);
	
	public void shutdown();
	
	public void addWorkers(int num);
	
	public void removeWorkers(int num);
	
	public int getJobSize();
}
