package com.nstc.singleton2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
 
/**
 * 测试四种单例方式 -- 第二种单例（懒加载）
 * @author Administrator
 * 
 */
public class TestSingleTonTwo {
 
    /**
     * 测试是否是单例
     */
    @Test
    public void testSingleTonTwo(){
        SingleTonTwo one1 = SingleTonTwo.getInstance();
        SingleTonTwo one2 = SingleTonTwo.getInstance();
        assertTrue(one1 == one2);
    }
     
    /**
     * 测试第二种单例测试
     * 运行结果：
     * -- single ton two hello --
     * 结论：
     * 运行静态方法时，不会调用私有构造方法（即：懒加载）
     */
    @Test
    public void testSingleTonTwoLoad(){
        SingleTonTwo.hello();
    }
}