package com.nstc.initialorder;

/**
 * 对于类的静态变量、静态初始化块、类的成员变量、初始化块、构造器来讲:
 * 它们的初始化顺序依次是（静态变量、静态初始化块）>（变量、初始化块）> 构造器
 * 可以通过下面的测试代码来验证这一点
 */

public class InitialOrderTest {

	// 类的静态变量
	public static String staticField = "类的静态变量";
	// 类的成员变量
	public String field = "类的成员变量";

	// 静态初始化块
	static {
		System.out.println(staticField);
		System.out.println("静态初始化块");
	}

	// 初始化块
	{
		System.out.println(field);
		System.out.println("初始化块");
	}

	// 构造器
	public InitialOrderTest() {
		System.out.println("构造器");
	}

	public static void main(String[] args) {
		new InitialOrderTest();
	}
}