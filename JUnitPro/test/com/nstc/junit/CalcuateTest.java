package com.nstc.junit;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalcuateTest {
	
	Calcuate cal;
	
	@Before
	public void setUp(){
		cal = new Calcuate();
		System.out.println("初始化！！！");
	}
	
	@BeforeClass
	//	该方法必须是public和static的
	public static void setUpClass(){
		System.out.println("测试类初始化！！！");
	}
	
	@After
	public void tearDown(){
		cal = null;
		System.out.println("销毁！！！");
		System.out.println();
	}
	
	@AfterClass
	//	该方法必须是public和static的
	public static void tearDownClass(){
		System.out.println("测试类销毁！！！");
	}
	
	@Test
	public void testAdd(){
		int rel = cal.add(12, 23);
		assertEquals("加法有问题", rel, 35);
	}
	
	@Test
	public void testMinus(){
		int rel = cal.minus(20,10);
		assertEquals("减法有问题", rel, 10);
	}
	
	@Ignore
	@Test
	public void testDivide(){
		int rel = cal.divide(20,10);
		assertEquals("除法有问题", rel, 2);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideException(){
		int rel = cal.divide(20,0);
		assertEquals("除法有问题", rel, 2);
	}
	
	@Test(timeout=200)
	public void time(){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rel = cal.divide(20,10);
		assertEquals("除法有问题", rel, 2);
	}
	
	
	@Test
	public void testMul(){
		int rel = cal.mul(20,10);
		assertEquals("乘法有问题", rel, 200);
	}
	
	@Test
	public void testHamcrest(){
		assertThat(50,allOf(greaterThan(49),lessThan(60)));
	}
	
	@Test
	public void testHamcrestEndsWith(){
		assertThat("like.txt",endsWith("txt"));
	}
}
