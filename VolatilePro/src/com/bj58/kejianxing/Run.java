package com.bj58.kejianxing;

public class Run {
	public static void main(String[] args){
		try{
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println(" 已经赋值为false了 ");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class RunThread extends Thread {
//	private boolean isRunning = true;
	volatile private boolean isRunning = true;
	
	public boolean isRunning(){
		return isRunning;
	}
	
	public void setRunning(boolean isRunning){
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		System.out.println(" 进入run了 ");
		while(isRunning == true) {
			
		}
		System.out.println(" 线程被停止了 ");
	}
	
}