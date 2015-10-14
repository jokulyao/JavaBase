package com.nstc.pattern.behavior.iterator;

import static org.junit.Assert.*;

import org.junit.Test;

public class IteratorTest {

	@Test
	public void test() {
		YaoCollection collection = new MyCollection();
		YaoIterator it = collection.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
