package com.nstc.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class TestLog4j {

	public static void main(String[] args) {
		PropertyConfigurator.configure("src/conf/log4j.properties");
		Logger logger = Logger.getLogger(TestLog4j.class);
//		System.out.println(1/0);
		try{
			logger.debug(1/0 + "debug");
		}catch(Exception e){
//			e.printStackTrace();
			System.out.println("aaa");
//			throw new RuntimeException(e);
		}
		logger.error("error");
		logger.debug("wohaoxiao");
	}
}
