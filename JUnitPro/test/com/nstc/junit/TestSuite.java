package com.nstc.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//@Suite.SuiteClasses({CalcuateTest.class, TestA.class, TestB.class})
@SuiteClasses({CalcuateTest.class, TestA.class, TestB.class})

public class TestSuite {
	
	@Test
	public void testSuite(){
		System.out.println("TestA");
	}
	
}
