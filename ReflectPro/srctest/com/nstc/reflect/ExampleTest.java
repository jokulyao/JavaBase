package com.nstc.reflect;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class ExampleTest {

	@Test
	/**
	 * 1.	ͨ��һ�������������İ���������
	 * 		������Ķ�����ʵ����Class��ʵ��
	 */
	public void reflect1Test() {
		Example example = new Example();
		System.out.println(example.getClass().getName());
	}
	
	@Test
	/**
	 * 2.	���ʵ����Class�����
	 */
	public void reflect2Test() {
		Class<?> demo1=null;
        Class<?> demo2=null;
        Class<?> demo3=null;
        try{
            //һ�㾡������������ʽ
            demo1=Class.forName("com.nstc.reflect.Example");
        }catch(Exception e){
            e.printStackTrace();
        }
        demo2 = new Example().getClass();
        demo3 = Example.class;
         
        System.out.println("������   "+demo1.getName());
        System.out.println("������   "+demo2.getName());
        System.out.println("������   "+demo3.getName());
	}
	
	@Test
	/**
	 * 3.	ͨ��Classʵ����������Ķ���
	 * 		ͨ���޲ι���ʵ��������(ע�⣺�����ǰ�Person�е�Ĭ�ϵ��޲ι��캯��ȡ����ʱ�򣬱����Լ�����ֻ����һ���в����Ĺ��캯��֮�󣬻���ִ���)
	 * 		���ʵ�����Ժ��ٱ�дʹ��Classʵ����������Ķ����ʱ��һ��Ҫ�Լ������޲εĹ��캯��
	 */
	public void reflect3Test() {
		Class<?> demo=null;
        try{
            demo=Class.forName("com.nstc.reflect.Person");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Person per=null;
        try {
            per=(Person)demo.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        per.setName("Rollen");
        per.setAge(20);
        System.out.println(per);
	}
	
	@Test
	/**
	 * 4.	ͨ��Class�����������еĹ��캯�� ��Ҳ����ͨ�����ַ�ʽͨ��Class����������Ķ���
	 */
	public void reflect4Test() {
		Class<?> demo = null;
		try {
			demo = Class.forName("com.nstc.reflect.Person2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Person2 per1 = null;
		Person2 per2 = null;
		Person2 per3 = null;
		Person2 per4 = null;
		// ȡ��ȫ���Ĺ��캯��
		Constructor<?> cons[] = demo.getConstructors();
		try {
			per1 = (Person2) cons[0].newInstance();
			per2 = (Person2) cons[1].newInstance("Rollen");
			per3 = (Person2) cons[2].newInstance(20);
			per4 = (Person2) cons[3].newInstance("Rollen", 20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
		System.out.println(per4);
	}
	
	@Test
	/**
	 * 5.	����һ����ʵ�ֵĽӿ�
	 */
	public void reflect5Test() {
		Class<?> demo = null;
		try {
			demo = Class.forName("com.nstc.reflect.Person2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// �������еĽӿ�
		Class<?> intes[] = demo.getInterfaces();
		for (int i = 0; i < intes.length; i++) {
			System.out.println("ʵ�ֵĽӿ�   " + intes[i].getName());
		}
	}
	
	@Test
	/**
	 * 6.	ȡ���������еĸ���
	 */
	public void reflect6Test() {
		Class<?> demo = null;
		try {
			demo = Class.forName("com.nstc.reflect.Person2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ȡ�ø���
		Class<?> temp = demo.getSuperclass();
		System.out.println("�̳еĸ���Ϊ��   " + temp.getName());
	}
	
	@Test
	public void reflect7Test() {
		
	}
}

