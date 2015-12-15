package com.nstc.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AlgorithmsTest {

	public static void main(String[] args){
		
		List list = new ArrayList(){};
		System.out.println(list.size());
		for(int i=0; i<12; i++){
			Map map = new HashMap();
			map.put("id", i);
			map.put("sumVal", Math.random()*10);
			list.add(map);
		}
		
		System.out.println(list);
		System.out.println();
		
		List resultList = new ArrayList();
		
		int sum = list.size();
		
		for(int i=0; i<10; i++){
			Double max = new Double(0.0);
			//第一遍遍历获取最大值
			for(Iterator it = list.iterator(); it.hasNext(); ){
				Map map = (Map)it.next();
				Double temp = new Double(map.get("sumVal").toString());
				if(temp == null){
					temp = new Double(0.0);
				}
				if(temp.compareTo(max) > 0){
					max = temp;
				}
			}
			//第二遍遍历
			for(Iterator it = list.iterator(); it.hasNext(); ){
				Map map = (Map)it.next();
				Double temp = new Double(map.get("sumVal").toString());
				if(temp == null){
					temp = new Double(0.0);
				}
				if(temp.compareTo(max) != 0){
					continue;
				}
				resultList.add(map);
				it.remove();
			}
		}
		
		System.out.println(resultList);
	}
}
