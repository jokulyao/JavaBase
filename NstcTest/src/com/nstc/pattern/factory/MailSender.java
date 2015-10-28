package com.nstc.pattern.factory;


public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("MailSender");
	}

}
