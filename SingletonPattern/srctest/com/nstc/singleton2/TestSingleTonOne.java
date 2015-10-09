package com.nstc.singleton2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestSingleTonOne {
 
    /**
     * 测试是否是单例
     */
    @Test
    public void testSingleTonOne(){
        SingleTonOne one1 = SingleTonOne.getInstance();
        SingleTonOne one2 = SingleTonOne.getInstance();
        assertTrue(one1 == one2);
    }
     
    /**
     * 测试第一种单例的加载方式
     * 运行结果：
     * ---singleton one---
     * ---singleton one hello---
     * 1、先执行了私有构造方法；
     * 2、然后再执行静态方法
     * 结论：
     * 当单纯的调用静态方法时，调用了私有构造方式是没有必要，也就是
     * 无法实现懒加载
     */
    @Test
    public void testSingleTonOneLoad(){
        SingleTonOne.hello();
    }
     
}