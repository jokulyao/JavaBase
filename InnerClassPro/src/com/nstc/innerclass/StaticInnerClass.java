package com.nstc.innerclass;

/**
 * ��.��̬�ڲ��ࣨҲ��Ƕ���ڲ��ࣩ
 * 
 *   1��ʹ���ڲ���ֻ��Ϊ�˰�һ������������һ������ڲ���������Ҫ�ڲ���������Χ��Ķ��󣬿��Խ��ڲ�������Ϊstatic���Ա��������������á�
 *   2��ֻ���ڲ����������Ϊstatic����̬�ڲ���Ķ������û�ж�����������Χ������������Ȩ�⣬���������е��ڲ���һ����
 *   3����̬�ڲ����ǲ���Ҫ�������ⲿ��ģ�������ľ�̬��Ա�����е����ƣ�����������ʹ���ⲿ��ķ�static��Ա�������߷�����
 *   	���ܺ���⣬��Ϊ��û���ⲿ��Ķ��������£����Դ�����̬�ڲ���Ķ��������������ⲿ��ķ�static��Ա�ͻ����ì�ܣ���Ϊ�ⲿ��ķ�static��Ա���������ھ���Ķ���
 *   
 * @author yaoxs
 *
 */
public class StaticInnerClass {
    public static void main(String[] args){
        Outer4.Inner inner = new Outer4.Inner();
        inner.print();
    }
}

class Outer4{
    
    private static String outerStaticVal = "�ⲿ�ྲ̬��Ա����";
    private String outerVal = "�ⲿ���Ա����";
    
    static class Inner{
        private static String innerStaticVal = "�ڲ��ྲ̬��Ա����";
        private String innerVal = "�ڲ����Ա����";
        
        public void print(){
            String innerVal = "�ֲ��������ڲ����Ա��������";
            String innerLocalVal = "�ڲ��෽���ֲ�����";
            
            //��̬�ڲ����޷������ⲿ��ĳ�Ա����
//            System.out.println(outerVal);
            //��̬�ڲ����޷������ⲿ��ĳ�Ա����
//            System.out.println(Outer.this.outerVal);
            
            //��̬�ڲ�����Է����ⲿ��ľ�̬��Ա����
            System.out.println(Outer4.outerStaticVal);
            
            //��̬�ڲ�����Է����Լ��ĳ�Ա����
            System.out.println(innerVal);
            //��̬�ڲ�������Լ��ĳ�Ա��������һ�ַ���
            System.out.println(this.innerVal);
            
            //��̬�ڲ�������Լ��ľ�̬��Ա����
            System.out.println(innerStaticVal);
        }
    }
}