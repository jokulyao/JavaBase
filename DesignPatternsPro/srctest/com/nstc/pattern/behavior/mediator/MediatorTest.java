package com.nstc.pattern.behavior.mediator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MediatorTest {

	@Test
	public void test() {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
