package com.nstc.pattern.behavior.iterator;

public interface YaoCollection {

	public YaoIterator iterator();

	/* ȡ�ü���Ԫ�� */
	public Object get(int i);

	/* ȡ�ü��ϴ�С */
	public int size();
}