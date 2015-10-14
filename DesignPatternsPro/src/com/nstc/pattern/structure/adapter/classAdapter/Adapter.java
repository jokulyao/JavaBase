package com.nstc.pattern.structure.adapter.classAdapter;

import com.nstc.pattern.structure.adapter.Source;
import com.nstc.pattern.structure.adapter.Targetable;

public class Adapter extends Source implements Targetable {

	@Override
	public void TargetableMethod() {
		System.out.println("this is the targetable method!");
	}
}