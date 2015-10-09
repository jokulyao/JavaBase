package com.nstc.singleton2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 测试枚举类型单例
 * @author Administrator
 *
 */
public class TestSingleTonEnum {
 
    /**
     * 测试是否是单例
     */
    @Test
    public void testSingleTonEnum(){
        SingleTonEnum enum1 = SingleTonEnum.INSTANCE;
        SingleTonEnum enum2 = SingleTonEnum.INSTANCE;
        assertTrue(enum1 == enum2);
    }
    /**
     * 测试是否懒加载
     * 结果：
     * -- enum singleton --
     * -- eum singleton hello --
     * 该枚举类型，无法懒加载
     */
    @Test
    public void testSingleTonEnum1(){
        SingleTonEnum.hello();
    }
}