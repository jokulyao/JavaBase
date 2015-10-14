package com.nstc.pattern.create.builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {

	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
		System.out.println("=============" + list.size());
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
		System.out.println("=============" + list.size());
	}
}