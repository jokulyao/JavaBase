package com.nstc.simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatError {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String[] dateStringArray = new String[] {
				"2000-01-01", "2000-01-02", "2000-01-03", "2000-01-04", "2000-01-05",
				"2000-01-06", "2000-01-07", "2000-01-08", "2000-01-09", "2000-01-10"
		};
		MyThread[] threadArray = new MyThread[2];
		for(int i=0; i<2; i++){
			threadArray[i] = new MyThread(sdf, dateStringArray[i]);
			threadArray[i].start();
		}
	}
}

class MyThread extends Thread {
	private SimpleDateFormat sdf;
	private String dateString;
	
	public MyThread(SimpleDateFormat sdf, String dateString){
		this.sdf = sdf;
		this.dateString = dateString;
	}
	
	@Override
	public void run(){
		try{
			/**
			 * 错误情况
			 */
//			Date dateRef = sdf.parse(dateString);
//			String newDateString = sdf.format(dateRef).toString();
			/**
			 * 正确情况（创建多个SimpleDateFormat实例）
			 */
//			Date dateRef = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
//			String newDateString = new SimpleDateFormat("yyyy-MM-dd").format(dateRef).toString();
			/**
			 * 正确情况（借助ThreadLocal类使每个线程都有自己的SimpleDateFormat）
			 */
			Date dateRef = DateTools.getSimpleDateFormat("yyyy-MM-dd").parse(dateString);
			String newDateString = DateTools.getSimpleDateFormat("yyyy-MM-dd").format(dateRef).toString();
			if(!newDateString.equals(dateString)){
				System.out.println("ThreadName=" + this.getName() 
						+ "报错了 日期字符串：" + dateString + " 转换成的日期为：" + newDateString);
			}
		} catch(ParseException e){
			e.printStackTrace();
		}
	}
}

class DateTools{
	private static ThreadLocal<SimpleDateFormat> t1 = new ThreadLocal<SimpleDateFormat>();
	public static SimpleDateFormat getSimpleDateFormat(String datePattern){
		SimpleDateFormat sdf = null;
		sdf = t1.get();
		if(sdf == null){
			sdf = new SimpleDateFormat(datePattern);
			t1.set(sdf);
		}
		return sdf;
	}
}