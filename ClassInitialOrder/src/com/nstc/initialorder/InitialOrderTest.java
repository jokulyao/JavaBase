package com.nstc.initialorder;

/**
 * ������ľ�̬��������̬��ʼ���顢��ĳ�Ա��������ʼ���顢����������:
 * ���ǵĳ�ʼ��˳�������ǣ���̬��������̬��ʼ���飩>����������ʼ���飩> ������
 * ����ͨ������Ĳ��Դ�������֤��һ��
 */

public class InitialOrderTest {

	// ��ľ�̬����
	public static String staticField = "��ľ�̬����";
	// ��ĳ�Ա����
	public String field = "��ĳ�Ա����";

	// ��̬��ʼ����
	static {
		System.out.println(staticField);
		System.out.println("��̬��ʼ����");
	}

	// ��ʼ����
	{
		System.out.println(field);
		System.out.println("��ʼ����");
	}

	// ������
	public InitialOrderTest() {
		System.out.println("������");
	}

	public static void main(String[] args) {
		new InitialOrderTest();
	}
}