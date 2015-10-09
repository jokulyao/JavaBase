package com.nstc.singleton2;
/**
 * �ڶ��ֵ������ģʽ
 * �����ء������Ϊ�̰߳�ȫ�ͷ��̰߳�ȫ���֣���ʹ���̰߳�ȫͬ��ʱ����Ӱ��Ч�ʡ�
 * @author Administrator
 *
 */
public class SingleTonTwo {
     
    private static SingleTonTwo instance ;
     
    private SingleTonTwo(){
        System.out.println("-- singleton two --");
    }
     
    /**
     * �����ش��������̲߳���ȫ
     * @return
     */
//  public static SingleTonTwo getInstance(){
//      if (instance == null){
//          instance = new SingleTonTwo();
//      }
//     
//      return instance;
//  }
    /**
     * ����ע�͵�getInstance�Ƿ��̰߳�ȫ�ģ��÷�������ͬ������
     * ���������̴߳�������Ч�ʲ���
     */
    public static synchronized SingleTonTwo getInstance(){
        if (instance == null){
            instance = new SingleTonTwo();
        }
         
        return instance;
    }
    
    public static void hello(){
        System.out.println("-- single ton two hello --");
    }
    
}