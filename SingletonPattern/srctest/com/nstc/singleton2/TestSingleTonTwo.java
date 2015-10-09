package com.nstc.singleton2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
 
/**
 * �������ֵ�����ʽ -- �ڶ��ֵ����������أ�
 * @author Administrator
 * 
 */
public class TestSingleTonTwo {
 
    /**
     * �����Ƿ��ǵ���
     */
    @Test
    public void testSingleTonTwo(){
        SingleTonTwo one1 = SingleTonTwo.getInstance();
        SingleTonTwo one2 = SingleTonTwo.getInstance();
        assertTrue(one1 == one2);
    }
     
    /**
     * ���Եڶ��ֵ�������
     * ���н����
     * -- single ton two hello --
     * ���ۣ�
     * ���о�̬����ʱ���������˽�й��췽�������������أ�
     */
    @Test
    public void testSingleTonTwoLoad(){
        SingleTonTwo.hello();
    }
}