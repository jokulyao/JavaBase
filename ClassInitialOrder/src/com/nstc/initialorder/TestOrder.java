package com.nstc.initialorder;

/**
 * ����(��̬�����;�̬��ʼ����֮��)��(�����ͳ�ʼ����֮��)���Ⱥ�˳�����������أ�
 * ʵ������ȡ�������������г��ֵ��Ⱥ�˳��
 * �����Ծ�̬�����;�̬��ʼ����Ϊ��������˵��
 * ͬ���������ͳ�ʼ����Ҳ��ѭ�������
 */

public class TestOrder { 
    // ��̬����        
    public static TestA a = new TestA();        
    
    // ��̬����
    public static TestB b = new TestB();        
 
    // ��̬��ʼ����        
    static {        
        System.out.println("��̬��ʼ����");        
    }        
 
    public static void main(String[] args) {        
        new TestOrder();        
    }        
}        
 
class TestA {        
    public TestA() {        
        System.out.println("Test--A");        
    }        
}        
 
class TestB {        
    public TestB() {        
        System.out.println("Test--B");        
    }        
}       
