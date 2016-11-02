package com.bj58.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	public static void main(String[] args) {
		/*
		 * List list = new ArrayList(); 
		 * list.add("qqyumidi");
		 * list.add("corn"); 
		 * list.add(100);
		 */
		List<String> list = new ArrayList<String>();
		list.add("qqyumidi");
		list.add("corn");
		// list.add(100);
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.println("name:" + name);
		}
	}
}