package com.nstc.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args){
		MyTask myTask = new MyTask();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Timer timer = new Timer(true);
		timer.schedule(myTask, 2000);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class MyTask extends TimerTask {
	@Override
	public void run() {
		System.out.println("运行了！时间为： " + new Date());
	}
}