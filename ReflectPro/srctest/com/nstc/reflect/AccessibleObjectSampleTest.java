package com.nstc.reflect;

import static org.junit.Assert.*;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

import org.junit.Test;

public class AccessibleObjectSampleTest {

	@Test
	public void test() throws IllegalArgumentException, IllegalAccessException {
		AccessibleObjectSample sample = new AccessibleObjectSample();
		Field[] fields = sample.getClass().getDeclaredFields();
		// 设置为true, 正常运行
		AccessibleObject.setAccessible(fields, true);
		
		// 设置为false, 抛出java.lang.IllegalAccessException异常
//		AccessibleObject.setAccessible(fields, false);
		
		System.out.println("修改之前：" + fields[0].get(sample));
		// 修改对象的私有域的值
		fields[0].setInt(sample, 100);
		System.out.println("修改之后：" + fields[0].get(sample));
	}
}