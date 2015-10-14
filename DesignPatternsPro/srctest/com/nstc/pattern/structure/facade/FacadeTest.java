package com.nstc.pattern.structure.facade;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.structure.facade.Computer;

public class FacadeTest {

	@Test
	public void test() {
		Computer computer = new Computer();
		computer.startup();
		System.out.println("-----------------------------");
		computer.shutdown();
	}
}