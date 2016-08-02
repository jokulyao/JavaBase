package com.bj58.classloader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException, IOException{
		// 1. ClassLoader的getSystemClassLoader()方法
		ClassLoader classLoaderFormSystem = ClassLoader.getSystemClassLoader();
		ClassLoader classLoaderFormSelf = ClassLoaderTest.class.getClassLoader();
		ClassLoader classLoaderFormClass = java.lang.Class.class.getClassLoader();
		System.out.println("classLoaderFormSystem : " + classLoaderFormSystem.getClass().getName());
		System.out.println("classLoaderFormSelf : " + classLoaderFormSelf.getClass().getName());
		System.out.println("classLoaderFormClass : " + classLoaderFormClass);
		System.out.println(classLoaderFormSystem == classLoaderFormSelf);
		System.out.println();
		
		
		// 2. ClassLoader的loadClass()方法
		Class<?> clazz = classLoaderFormSelf.loadClass(ClassLoaderTest.class.getName());
		System.out.println(clazz.getName());
		System.out.println(clazz.getDeclaredFields());
		System.out.println(clazz.getDeclaredMethods());
		System.out.println(clazz.getClassLoader().getClass().getName());
		System.out.println();
		
		// 3. ClassLoader的getResource()方法
		URL url = classLoaderFormSystem.getResource("a.txt");
		Reader reader = new InputStreamReader(url.openStream());
		System.out.println((char)(reader.read()));
		reader.close();
		
		reader = new InputStreamReader(classLoaderFormSystem.getResourceAsStream("a.txt"));
		System.out.println((char)(reader.read()));
		reader.close();
		System.out.println();
		
		// 4. ClassLoader的getResources()方法
		Enumeration<URL> urls = classLoaderFormSystem.getResources("a.txt");
		while (urls.hasMoreElements()){
			URL urlLocal = urls.nextElement();
			Reader readerLocal = new InputStreamReader(url.openStream());
			System.out.println((char)(readerLocal.read()));
			readerLocal.close();
		}
		System.out.println();
		
		// 5. ClassLoader的getSystemResources()方法
		URL urlSystem = classLoaderFormSystem.getSystemResource("a.txt");
		Reader readerSystem = new InputStreamReader(urlSystem.openStream());
		System.out.println((char)(readerSystem.read()));
		readerSystem.close();
	}
}