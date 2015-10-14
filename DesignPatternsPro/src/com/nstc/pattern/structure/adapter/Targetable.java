package com.nstc.pattern.structure.adapter;

public interface Targetable {

	/* 与原类(Source)中的方法相同 */
	public void sourceMethod();

	/* 新类的方法 */
	public void TargetableMethod();
}
