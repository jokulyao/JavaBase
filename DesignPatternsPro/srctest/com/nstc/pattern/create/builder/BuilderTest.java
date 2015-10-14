package com.nstc.pattern.create.builder;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.create.builder.Builder;

public class BuilderTest {

	@Test
	public void test() {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}
