package com.nstc.access;

public class Access {
	private String privateStr = "private��Ա����";
	String defaultStr = "default��Ա����";
	protected String protectedStr = "protected��Ա����";
	public String publicStr = "public��Ա����";

	// ֻ��Access���Լ��ܷ���private��Ա����
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
		// AccessPackage�಻��ֱ�ӷ���Access���private��Ա����
		System.out.println(access.getPrivateStr());
		System.out.println(access.defaultStr);
		System.out.println(access.protectedStr);
		System.out.println(access.publicStr);
	}
}