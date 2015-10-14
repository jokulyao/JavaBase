package com.nstc.pattern.structure.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.structure.proxy.Proxy;
import com.nstc.pattern.structure.proxy.Sourceable;

public class ProxyTest {

	@Test
	public void test() {
		Sourceable source = new Proxy();
		source.method();
	}
}
