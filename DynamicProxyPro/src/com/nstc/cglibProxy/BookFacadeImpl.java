package com.nstc.cglibProxy;

/**
 * 这个是没有实现接口的实现类(特别注意，如果这样的话是没有办法通过Java的JDK来实现动态代理的)
 * 
 */
public class BookFacadeImpl {
	public void addBook() {
		System.out.println("增加图书的普通方法...");
	}
}