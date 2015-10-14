package com.nstc.pattern.structure.adapter.classAdapter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.structure.adapter.Targetable;
import com.nstc.pattern.structure.adapter.classAdapter.Adapter;

public class AdapterTest {

	@Test
	public void test() {
		Targetable target = new Adapter();
		target.sourceMethod();
		target.TargetableMethod();
	}
}
