package com.bj58.artconcurrent.chapter04.threadpool;

import java.awt.JobAttributes;
import java.util.LinkedList;

public class DefaultThreadPool<Job extends Runnable> implements ThreadPool<Job> {

	private final LinkedList<Job> jobs = new LinkedList<Job>();
	
//	private final List<Worker> workers = new List<Worker>();
	
	public DefaultThreadPool(){
		
	}
	
	private void init(int num){
		for(int i=0; i<num; i++){
			
		}
	}

	@Override
	public void execute(Job job) {
		
	}

	@Override
	public void shutdown() {
		
	}

	@Override
	public void addWorkers(int num) {
		
	}

	@Override
	public void removeWorkers(int num) {
		
	}

	@Override
	public int getJobSize() {
		return 0;
	}







	class Worker implements Runnable{
		private volatile boolean running = true;
		
		@Override
		public void run(){
			while(running){
				Job job = null;
				synchronized (jobs) {
					while (jobs.isEmpty()) {
						try{
							jobs.wait();
						}catch(InterruptedException e){
							Thread.currentThread().interrupt();
							return;
						}
					}
					job = jobs.removeFirst();
				}
				if(job != null){
					try{
						job.run();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
		
		public void shutdown(){
			running = false;
		}
		
	}

}


