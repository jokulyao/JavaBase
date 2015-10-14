package com.nstc.pattern.structure.adapter.objectAdapter;

import com.nstc.pattern.structure.adapter.Source;
import com.nstc.pattern.structure.adapter.Targetable;

public class Wrapper implements Targetable {

	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void TargetableMethod() {
		System.out.println("this is the targetable method!");
	}

	@Override
	public void sourceMethod() {
		source.sourceMethod();
	}
}