package com.nstc.singleton2;
/**
 * ö������ʵ�ֵ���
 * ������jdk5.0���ϲž߱��ģ�δʵ�������أ����߳��Ѻã������޷�ͨ��java������ʵ�������ʵ����
 * @author Administrator
 *
 */
public enum SingleTonEnum {
    /**
     * ����ʵ��
     */
    INSTANCE;
     
    private SingleTonEnum(){
        System.out.println("-- enum singleton --");
    }
    
    public static void hello(){
        System.out.println("-- eum singleton hello --");
    }
     
     
}