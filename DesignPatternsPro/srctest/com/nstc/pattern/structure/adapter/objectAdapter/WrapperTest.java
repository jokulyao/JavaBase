package com.nstc.pattern.structure.adapter.objectAdapter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.structure.adapter.Source;
import com.nstc.pattern.structure.adapter.Targetable;
import com.nstc.pattern.structure.adapter.objectAdapter.Wrapper;

public class WrapperTest {

	@Test
	public void test() {
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.sourceMethod();
		target.TargetableMethod();
	}
}
