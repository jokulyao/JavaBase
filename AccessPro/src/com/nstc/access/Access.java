package com.nstc.access;

public class Access {
	private String privateStr = "private成员变量";
	String defaultStr = "default成员变量";
	protected String protectedStr = "protected成员变量";
	public String publicStr = "public成员变量";

	// 只有Access类自己能访问private成员变量
	public String getPrivateStr() {
		return privateStr;
	}

	public static void main(String[] args) {
		AccessPackage accessPackage = new AccessPackage();
		accessPackage.testAccessPackage();
	}
}

class AccessPackage {
	Access access = new Access();

	public void testAccessPackage() {
		// System.out.println(access.privateStr);
		// AccessPackage类不能直接访问Access类的private成员变量
		System.out.println(access.getPrivateStr());
		System.out.println(access.defaultStr);
		System.out.println(access.protectedStr);
		System.out.println(access.publicStr);
	}
}