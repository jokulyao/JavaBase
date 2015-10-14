package com.nstc.pattern.create.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonOtherTest {

	@Test
	public void test() {
		SingletonOther s1 = SingletonOther.getInstance();
		SingletonOther s2 = SingletonOther.getInstance();
		System.out.println(s1 == s2);
	}
}