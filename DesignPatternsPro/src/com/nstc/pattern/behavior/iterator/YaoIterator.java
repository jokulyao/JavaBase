package com.nstc.pattern.behavior.iterator;

public interface YaoIterator {
	// ǰ��
	public Object previous();

	// ����
	public Object next();

	public boolean hasNext();

	// ȡ�õ�һ��Ԫ��
	public Object first();
}