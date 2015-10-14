package com.nstc.pattern.structure.bridge;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.structure.bridge.Bridge;
import com.nstc.pattern.structure.bridge.MyBridge;
import com.nstc.pattern.structure.bridge.SourceSub1;
import com.nstc.pattern.structure.bridge.SourceSub2;
import com.nstc.pattern.structure.bridge.Sourceable;

public class BridgeTest {

	@Test
	public void test() {
		Bridge bridge = new MyBridge();

		/* ���õ�һ������ */
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();

		/* ���õڶ������� */
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}
}