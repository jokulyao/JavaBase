package com.nstc.access;

import com.nstc.access.Access;

public class SubAccess extends Access {

	public void testSubAccess() {
		// System.out.println(privateStr);
		//��ͬ���µ�����SubAccess���ܷ���Access���private��Ա����
		// System.out.println(defaultStr);
		//��ͬ���µ�����SubAccess���ܷ���Access���default��Ա����
		System.out.println(protectedStr);
		System.out.println(publicStr);
	}

	public static void main(String[] args) {
		new SubAccess().testSubAccess();
	}
}