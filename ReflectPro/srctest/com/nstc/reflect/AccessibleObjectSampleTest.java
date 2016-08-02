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
		// ����Ϊtrue, ��������
		AccessibleObject.setAccessible(fields, true);
		
		// ����Ϊfalse, �׳�java.lang.IllegalAccessException�쳣
//		AccessibleObject.setAccessible(fields, false);
		
		System.out.println("�޸�֮ǰ��" + fields[0].get(sample));
		// �޸Ķ����˽�����ֵ
		fields[0].setInt(sample, 100);
		System.out.println("�޸�֮��" + fields[0].get(sample));
	}
}