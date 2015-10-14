package com.nstc.pattern.structure.adapter.interfaceAdapter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.structure.adapter.interfaceAdapter.SourceSub1;
import com.nstc.pattern.structure.adapter.interfaceAdapter.SourceSub2;
import com.nstc.pattern.structure.adapter.interfaceAdapter.Sourceable;

public class WrapperTest {

	@Test
	public void test() {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();

		source1.sourceableMethod1();
		source1.sourceableMethod2();
		source2.sourceableMethod1();
		source2.sourceableMethod2();
	}
}
