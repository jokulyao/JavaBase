package com.nstc.pattern.behavior.state;

import static org.junit.Assert.*;

import org.junit.Test;

public class StateTest {

	@Test
	public void test() {

		State state = new State();
		Context context = new Context(state);

		// ���õ�һ��״̬
		state.setValue("state1");
		context.method();

		// ���õڶ���״̬
		state.setValue("state2");
		context.method();
	}
}
