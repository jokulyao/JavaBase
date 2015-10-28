package com.nstc.pattern.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonOtherTest {

	@Test
	public void testGetInstance() {
		SingletonOther sin1 = SingletonOther.getInstance();
		SingletonOther sin2 = SingletonOther.getInstance();
		System.out.println(sin1 == sin2);
		
	}

}
