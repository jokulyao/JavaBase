package com.nstc.access;

import com.nstc.access.Access;

public class SubAccess extends Access {

	public void testSubAccess() {
		// System.out.println(privateStr);
		//不同包下的子类SubAccess不能访问Access类的private成员变量
		// System.out.println(defaultStr);
		//不同包下的子类SubAccess不能访问Access类的default成员变量
		System.out.println(protectedStr);
		System.out.println(publicStr);
	}

	public static void main(String[] args) {
		new SubAccess().testSubAccess();
	}
}