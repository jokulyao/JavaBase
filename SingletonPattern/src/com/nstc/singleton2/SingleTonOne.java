package com.nstc.singleton2;
/**
 * ��һ�ֵ������ģʽ
 * ���߱������صĹ�Ч
 * @author Administrator
 *
 */
public class SingleTonOne {
    // ʵ����
    private static SingleTonOne instance = new SingleTonOne();
     
    // ˽�й��췽��
    private SingleTonOne(){
        System.out.println("---singleton one---");
    }
     
    // ��ȡ����ʵ��
    public static SingleTonOne getInstance(){
        return instance;
    }
     
    // ��̬����
    public static void hello(){
        System.out.println("---singleton one hello---");
    }
     
}