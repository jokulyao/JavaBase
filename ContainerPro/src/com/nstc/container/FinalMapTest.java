package com.nstc.container;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FinalMapTest {
	public static void main(String[] args){
		Example example = new Example();
		Map<String, String> map = new HashMap<String, String>();
		map.put("bbbbb", "BBBBBB");
		example.print(map);
		for(Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext(); ){
			System.out.println(it.next().getValue());
		}
		System.out.println("1");
		for(Map.Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getValue());
		}
		System.out.println("2");
		for(String v : map.values()){
			System.out.println(v);
		}
		System.out.println("3");
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next().getValue());
		}
		System.out.println("4");
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
		System.out.println("5");
		Set<Map.Entry<String, String>> set = map.entrySet();
		for(Iterator<Map.Entry<String, String>> it2 = set.iterator(); it2.hasNext(); ){
			System.out.println(it2.next().getValue());
		}
	}
}

class Example{
	public void print(final Map<String, String> map){
		map.put("aaaaa", "AAAAA");
	}
}