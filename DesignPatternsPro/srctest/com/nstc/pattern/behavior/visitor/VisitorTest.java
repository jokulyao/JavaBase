package com.nstc.pattern.behavior.visitor;

import static org.junit.Assert.*;

import org.junit.Test;

public class VisitorTest {

	@Test
	public void test() {
		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}
}