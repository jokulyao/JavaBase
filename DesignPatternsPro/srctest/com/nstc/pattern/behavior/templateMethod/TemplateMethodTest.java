package com.nstc.pattern.behavior.templateMethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemplateMethodTest {

	@Test
	public void test() {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}