package com.nstc.initialorder;

/**
 * ���ڼ̳�����£������Ǹ�����ȫ��ʼ����Ϻ�Ž�������ĳ�ʼ��
 * ʵ��������ľ�̬�����;�̬��ʼ����ĳ�ʼ�����ڸ���ı�������ʼ����͹�������ʼ��֮ǰ�������
 *
 */

class Parent {        
    // ��̬����        
    public static String p_StaticField = "����ParentClass--��̬����";        
    // ����        
    public String p_Field = "����ParentClass--����";        
 
    // ��̬��ʼ����
    static {        
        System.out.println(p_StaticField);        
        System.out.println("����ParentClass--��̬��ʼ����");        
    }        
 
    // ��ʼ����
    {        
        System.out.println(p_Field);        
        System.out.println("����ParentClass--��ʼ����");        
    }        
 
    // ������
    public Parent() {        
        System.out.println("����ParentClass--������");        
    }        
}        
 
public class SubClass extends Parent {        
    // ��̬����
    public static String s_StaticField = "����SubClass--��̬����";        
    // ����
    public String s_Field = "����SubClass--����";        
    // ��̬��ʼ����        
    static {        
        System.out.println(s_StaticField);        
        System.out.println("����SubClass--��̬��ʼ����");        
    }        
    // ��ʼ����        
    {        
        System.out.println(s_Field);        
        System.out.println("����SubClass--��ʼ����");        
    }        
 
    // ������        
    public SubClass() {        
        System.out.println("����SubClass--������");        
    }        
 
    // �������        
    public static void main(String[] args) {        
        new SubClass();        
    }        
}     