package com.nstc.pattern.structure.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.structure.decorator.Decorator;
import com.nstc.pattern.structure.decorator.Source;
import com.nstc.pattern.structure.decorator.Sourceable;

public class DecoratorTest {

	@Test
	public void test() {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}