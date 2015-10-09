package com.nstc.singleton2;
/**
 * 第二种单例设计模式
 * 懒加载、如果分为线程安全和非线程安全两种，当使用线程安全同步时，会影响效率。
 * @author Administrator
 *
 */
public class SingleTonTwo {
     
    private static SingleTonTwo instance ;
     
    private SingleTonTwo(){
        System.out.println("-- singleton two --");
    }
     
    /**
     * 懒加载处理，但是线程不安全
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
     * 上述注释的getInstance是非线程安全的，该方法做了同步处理；
     * 但是由于线程处理，往往效率不高
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