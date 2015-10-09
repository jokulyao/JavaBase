package com.nstc.singleton2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestSingleTonOne {
 
    /**
     * �����Ƿ��ǵ���
     */
    @Test
    public void testSingleTonOne(){
        SingleTonOne one1 = SingleTonOne.getInstance();
        SingleTonOne one2 = SingleTonOne.getInstance();
        assertTrue(one1 == one2);
    }
     
    /**
     * ���Ե�һ�ֵ����ļ��ط�ʽ
     * ���н����
     * ---singleton one---
     * ---singleton one hello---
     * 1����ִ����˽�й��췽����
     * 2��Ȼ����ִ�о�̬����
     * ���ۣ�
     * �������ĵ��þ�̬����ʱ��������˽�й��췽ʽ��û�б�Ҫ��Ҳ����
     * �޷�ʵ��������
     */
    @Test
    public void testSingleTonOneLoad(){
        SingleTonOne.hello();
    }
     
}