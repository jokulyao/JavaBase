package com.nstc.pattern.behavior.observer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void test() {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());

		sub.operation();
	}
}
