package com.nstc.container;

import java.util.*;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i : arr) {
			System.out.println(i);
		}

		Collection<String> c = new ArrayList<String>();
		c.add(new String("aaa"));
		c.add(new String("bbb"));
		c.add(new String("ccc"));
		for (Object o : c) {
			System.out.println(o);
		}
	}
}