package com.nstc.pattern.factory;


public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("SmsSender");
	}

}
