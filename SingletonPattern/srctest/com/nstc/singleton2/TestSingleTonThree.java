package com.nstc.singleton2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 测试四种单例方式 -- 第三种单例（内部静态类）
 * @author Administrator
 * 
 */
public class TestSingleTonThree {
 
    /**
     * 测试是否是单例
     */
    @Test
    public void testSingleTonThree(){
        SingleTonThree one1 = SingleTonThree.getInstance();
        SingleTonThree one2 = SingleTonThree.getInstance();
        assertTrue(one1 == one2);
    }
     
    /**
     * 第三种单例测试
     * 运行结果：
     * -- SingleTonThree hello --
     * 结论：
     * 没有触发构造方法，仅仅执行了方法内部逻辑；实现了懒加载方式。
     */
    @Test
    public void testSingleTonThreeLoad(){
        SingleTonThree.hello();
    }
}