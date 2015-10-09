package com.nstc.singleton2;
/**
 * 第一种单例设计模式
 * 不具备懒加载的功效
 * @author Administrator
 *
 */
public class SingleTonOne {
    // 实例化
    private static SingleTonOne instance = new SingleTonOne();
     
    // 私有构造方法
    private SingleTonOne(){
        System.out.println("---singleton one---");
    }
     
    // 获取单例实例
    public static SingleTonOne getInstance(){
        return instance;
    }
     
    // 静态方法
    public static void hello(){
        System.out.println("---singleton one hello---");
    }
     
}