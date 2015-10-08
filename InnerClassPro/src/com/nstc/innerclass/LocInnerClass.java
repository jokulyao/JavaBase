package com.nstc.innerclass;

/**
 * �����ֲ��ڲ���
 * �ֲ��ڲ����Ƕ�����һ����������һ��������������࣬���ͳ�Ա�ڲ�����������ھֲ��ڲ���ķ��ʽ����ڷ����ڻ��߸��������ڡ�
 * ע�⣬�ֲ��ڲ�������Ƿ��������һ���ֲ�����һ�����ǲ�����public��protected��private�Լ�static���η��ġ�
 * �ֲ��ڲ�����һ�����ƣ����Ƕ��ⲿ������ȫ������������
 * �ֲ��໹��һ�����ƣ����Է��ʾֲ��������������ֲ�������������Ϊfinal��
 * 
 * @author yaoxs
 *
 */
public class LocInnerClass {
	public static void main(String[] args){
        Outer2 outer2 = new Outer2();
        outer2.print();
    }
}

class Outer2{
    
    private static String outerStaticVal = "�ⲿ�ྲ̬��Ա����";
    private String outerVal = "�ⲿ���Ա����";
    
    public void print(){
        class Inner{
            private String innerVal = "�ڲ����Ա����";
//            private static String innerStaticVal = "�ڲ��ྲ̬��Ա����";
        }
        //���ʾֲ��ڲ���ĳ�Ա����
        System.out.println(new Inner().innerVal);
        
        //�����ⲿ��ľ�̬��Ա����
        System.out.println(this.outerStaticVal);
        System.out.println(Outer2.outerStaticVal);
        //�����ⲿ��ĳ�Ա����
        System.out.println(outerVal);
        System.out.println(this.outerVal);
    }
}  