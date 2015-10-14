package com.nstc.pattern.behavior.iterator;

public interface YaoIterator {
	// 前移
	public Object previous();

	// 后移
	public Object next();

	public boolean hasNext();

	// 取得第一个元素
	public Object first();
}