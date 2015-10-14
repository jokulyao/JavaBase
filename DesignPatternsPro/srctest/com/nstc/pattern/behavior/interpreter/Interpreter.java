package com.nstc.pattern.behavior.interpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class Interpreter {

	@Test
	public void test() {

		// ����9+2-8��ֵ
		int result = new Minus().interpret((new Context(new Plus()
				.interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}