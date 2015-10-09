package com.nstc.singleton2;
/**
 * 内部类实现单例
 * 懒加载、且适合多线程，效率很高；
 * 但是可以通过java反射来实例化多个实例，因此在一般情况下，该方式实现比较好；
 */
public class SingleTonThree {
     
    private SingleTonThree(){
        System.out.println("-- SingleTon Three --");
    }
    /**
     * 内部类实例化
     * @author Administrator
     *
     */
    private static class SingleTonThreeHandler{
        public static SingleTonThree instance = new SingleTonThree();
    }
     
    /**
     * 通过内部类，获取实例
     * @return
     */
    public static SingleTonThree getInstance(){
        return SingleTonThreeHandler.instance;
    }
     
    public static void hello(){
        System.out.println("-- SingleTonThree hello --");
    }
     
     
}