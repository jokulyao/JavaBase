package com.nstc.singleton2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * ����ö�����͵���
 * @author Administrator
 *
 */
public class TestSingleTonEnum {
 
    /**
     * �����Ƿ��ǵ���
     */
    @Test
    public void testSingleTonEnum(){
        SingleTonEnum enum1 = SingleTonEnum.INSTANCE;
        SingleTonEnum enum2 = SingleTonEnum.INSTANCE;
        assertTrue(enum1 == enum2);
    }
    /**
     * �����Ƿ�������
     * �����
     * -- enum singleton --
     * -- eum singleton hello --
     * ��ö�����ͣ��޷�������
     */
    @Test
    public void testSingleTonEnum1(){
        SingleTonEnum.hello();
    }
}