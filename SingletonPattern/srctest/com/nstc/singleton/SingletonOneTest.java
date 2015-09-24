package com.nstc.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonOneTest{

	@Test
	public void test(){
		SingletonOne singletonOne = SingletonOne.getInstance();
		SingletonOne singletonTwo = SingletonOne.getInstance();
		Assert.assertEquals(singletonOne, singletonTwo);
	}
}
