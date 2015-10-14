package com.nstc.pattern.behavior.iterator;

public class MyCollection implements YaoCollection {

	public String string[] = { "A", "B", "C", "D", "E" };

	@Override
	public YaoIterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return string[i];
	}

	@Override
	public int size() {
		return string.length;
	}
}