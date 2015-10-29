package com.nstc.pattern.builder;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.nstc.pattern.factory.Sender;

public class BuilderTest {

	@Test
	public void testProduce() {
		Builder builder = new Builder();
		builder.produceMailSender(10);
		System.out.println(builder.list.size());
	}

}
