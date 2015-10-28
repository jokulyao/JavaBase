package com.nstc.pattern.singleton;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testGetInstance() {
		Singleton sin1 = Singleton.getInstance();
		Singleton sin2 = Singleton.getInstance();
		System.out.println(sin1 == sin2);
//		http://www.cnblogs.com/xdp-gacl/p/3777987.html
	}
}
