package com.bj58.classloader;

public class ClassLoaderJar {
	
	public static void main(String[] args){
		System.out.println(System.getProperty("sun.boot.class.path"));
		System.out.println();
		System.out.println(System.getProperty("java.ext.dirs"));
		System.out.println();
		System.out.println(System.getProperty("java.class.path"));
	}

}