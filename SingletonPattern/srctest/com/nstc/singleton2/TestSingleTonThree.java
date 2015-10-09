package com.nstc.singleton2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * �������ֵ�����ʽ -- �����ֵ������ڲ���̬�ࣩ
 * @author Administrator
 * 
 */
public class TestSingleTonThree {
 
    /**
     * �����Ƿ��ǵ���
     */
    @Test
    public void testSingleTonThree(){
        SingleTonThree one1 = SingleTonThree.getInstance();
        SingleTonThree one2 = SingleTonThree.getInstance();
        assertTrue(one1 == one2);
    }
     
    /**
     * �����ֵ�������
     * ���н����
     * -- SingleTonThree hello --
     * ���ۣ�
     * û�д������췽��������ִ���˷����ڲ��߼���ʵ���������ط�ʽ��
     */
    @Test
    public void testSingleTonThreeLoad(){
        SingleTonThree.hello();
    }
}