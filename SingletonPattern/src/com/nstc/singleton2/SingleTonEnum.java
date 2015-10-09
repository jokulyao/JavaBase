package com.nstc.singleton2;
/**
 * 枚举类型实现单例
 * 必须在jdk5.0以上才具备的，未实现懒加载，多线程友好，并且无法通过java反射来实例化多个实例。
 * @author Administrator
 *
 */
public enum SingleTonEnum {
    /**
     * 单例实例
     */
    INSTANCE;
     
    private SingleTonEnum(){
        System.out.println("-- enum singleton --");
    }
    
    public static void hello(){
        System.out.println("-- eum singleton hello --");
    }
     
     
}