package com.nstc.innerclass;

/**
 * һ����Ա�ڲ��ࣨ�ڲ���Ķ�������һ����ʽ���ã���ָ���˴��������ⲿ����󡣣�
 *   1) ��Ա�ڲ�����������������ⲿ������г�Ա���Ժͳ�Ա����������private��Ա�;�̬��Ա����
 *   2) ��Ա�ڲ����������ⲿ������ڵģ�Ҳ����˵�����Ҫ������Ա�ڲ���Ķ���ǰ���Ǳ������һ���ⲿ��Ķ���
 *   3) ����Ҫע����ǣ�����Ա�ڲ���ӵ�к��ⲿ��ͬ���ĳ�Ա�������߷���ʱ���ᷢ���������󣬼�Ĭ������·��ʵ��ǳ�Ա�ڲ���ĳ�Ա��
 *      ���Ҫ�����ⲿ���ͬ����Ա����Ҫ���������ʽ���з��ʣ�
 *   	�ⲿ��.this.��Ա����
 *   	�ⲿ��.this.��Ա����
 *   4) ��Ȼ��Ա�ڲ�������������ط����ⲿ��ĳ�Ա�����ⲿ������ʳ�Ա�ڲ���ĳ�Աȴ������ô���������ˡ�
 *      ���ⲿ�������Ҫ���ʳ�Ա�ڲ���ĳ�Ա�������ȴ���һ����Ա�ڲ���Ķ�����ͨ��ָ��������������������
 *��   5) �ڲ������ӵ��private����Ȩ�ޡ�protected����Ȩ�ޡ�public����Ȩ�޼�������Ȩ�ޡ�
 *		�����Ա�ڲ���Inner��private���Σ���ֻ�����ⲿ����ڲ����ʣ������public���Σ����κεط����ܷ��ʣ�
 *		�����protected���Σ���ֻ����ͬһ�����»��߼̳��ⲿ�������·��ʣ�
 *		�����Ĭ�Ϸ���Ȩ�ޣ���ֻ����ͬһ�����·��ʡ�
 *		��һ����ⲿ����һ�㲻һ�����ⲿ��ֻ�ܱ�public�Ͱ���������Ȩ�����Ρ�
 * 
 * @author yaoxs
 *
 */
public class MemberInnerClass {
    public static void main(String[] args){
        Outer.Inner inner = new Outer().new Inner();
        inner.print();
    }
}

class Outer{
    
    private static String outerStaticVal = "�ⲿ�ྲ̬��Ա����";
    private String outerVal = "�ⲿ���Ա����";
    
    class Inner{
        //�ڲ����в��ܳ��־�̬����
//      private static int innerStaticVal;
        private String innerVal = "�ڲ����Ա����";
        
        public void print(){
            String innerVal = "�ֲ��������ڲ����Ա��������";
            String innerLocalVal = "�ڲ��෽���ֲ�����";
            
            //�ڲ�������ⲿ��ĳ�Ա����
            System.out.println(outerVal);
            //�ڲ�������ⲿ��ĳ�Ա��������һ�ַ���
            System.out.println(Outer.this.outerVal);
            
            //�ڲ���Ҳ���Է����ⲿ��ľ�̬��Ա����
            System.out.println(Outer.outerStaticVal);
            
            //�ڲ�����Է����Լ��ĳ�Ա����
            System.out.println(innerVal);
            //�ڲ�������Լ��ĳ�Ա��������һ�ַ���
            System.out.println(this.innerVal);
            
            //�ڲ��෽�����ʾֲ�����
            System.out.println(innerLocalVal);
        }
    }
}