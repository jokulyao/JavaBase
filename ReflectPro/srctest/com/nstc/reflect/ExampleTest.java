package com.nstc.reflect;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class ExampleTest {

	@Test
	/**
	 * 1.	通过一个对象获得完整的包名和类名
	 * 		所有类的对象其实都是Class的实例
	 */
	public void reflect1Test() {
		Example example = new Example();
		System.out.println(example.getClass().getName());
	}
	
	@Test
	/**
	 * 2.	如何实例化Class类对象
	 */
	public void reflect2Test() {
		Class<?> demo1=null;
        Class<?> demo2=null;
        Class<?> demo3=null;
        try{
            //一般尽量采用这种形式
            demo1=Class.forName("com.nstc.reflect.Example");
        }catch(Exception e){
            e.printStackTrace();
        }
        demo2 = new Example().getClass();
        demo3 = Example.class;
         
        System.out.println("类名称   "+demo1.getName());
        System.out.println("类名称   "+demo2.getName());
        System.out.println("类名称   "+demo3.getName());
	}
	
	@Test
	/**
	 * 3.	通过Class实例化其他类的对象
	 * 		通过无参构造实例化对象(注意：当我们把Person中的默认的无参构造函数取消的时候，比如自己定义只定义一个有参数的构造函数之后，会出现错误)
	 * 		最佳实践：以后再编写使用Class实例化其他类的对象的时候，一定要自己定义无参的构造函数
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
	 * 4.	通过Class调用其他类中的构造函数 （也可以通过这种方式通过Class创建其他类的对象）
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
		// 取得全部的构造函数
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
	 * 5.	返回一个类实现的接口
	 */
	public void reflect5Test() {
		Class<?> demo = null;
		try {
			demo = Class.forName("com.nstc.reflect.Person2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 保存所有的接口
		Class<?> intes[] = demo.getInterfaces();
		for (int i = 0; i < intes.length; i++) {
			System.out.println("实现的接口   " + intes[i].getName());
		}
	}
	
	@Test
	/**
	 * 6.	取得其他类中的父类
	 */
	public void reflect6Test() {
		Class<?> demo = null;
		try {
			demo = Class.forName("com.nstc.reflect.Person2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 取得父类
		Class<?> temp = demo.getSuperclass();
		System.out.println("继承的父类为：   " + temp.getName());
	}
	
	@Test
	public void reflect7Test() {
		
	}
}

