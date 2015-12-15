package com.nstc.test;

import java.util.HashMap;
import java.util.Map;

public class SerialiazableTest {

	public static void main(String[] args){
		Parent parent = new Parent();
		Child child = new Child();
		Map map = new HashMap();
		map.put("child", child);
		parent.setResult(map);
		System.out.println(parent);
	}
}