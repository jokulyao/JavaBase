package com.nstc.singleton2;
/**
 * �ڲ���ʵ�ֵ���
 * �����ء����ʺ϶��̣߳�Ч�ʺܸߣ�
 * ���ǿ���ͨ��java������ʵ�������ʵ���������һ������£��÷�ʽʵ�ֱȽϺã�
 */
public class SingleTonThree {
     
    private SingleTonThree(){
        System.out.println("-- SingleTon Three --");
    }
    /**
     * �ڲ���ʵ����
     * @author Administrator
     *
     */
    private static class SingleTonThreeHandler{
        public static SingleTonThree instance = new SingleTonThree();
    }
     
    /**
     * ͨ���ڲ��࣬��ȡʵ��
     * @return
     */
    public static SingleTonThree getInstance(){
        return SingleTonThreeHandler.instance;
    }
     
    public static void hello(){
        System.out.println("-- SingleTonThree hello --");
    }
     
     
}