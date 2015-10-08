package com.nstc.innerclass;

/**
 * 一、成员内部类（内部类的对象总有一个隐式引用，它指向了创建它的外部类对象。）
 *   1) 成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）。
 *   2) 成员内部类是依附外部类而存在的，也就是说，如果要创建成员内部类的对象，前提是必须存在一个外部类的对象。
 *   3) 不过要注意的是，当成员内部类拥有和外部类同名的成员变量或者方法时，会发生隐藏现象，即默认情况下访问的是成员内部类的成员。
 *      如果要访问外部类的同名成员，需要以下面的形式进行访问：
 *   	外部类.this.成员变量
 *   	外部类.this.成员方法
 *   4) 虽然成员内部类可以无条件地访问外部类的成员，而外部类想访问成员内部类的成员却不是这么随心所欲了。
 *      在外部类中如果要访问成员内部类的成员，必须先创建一个成员内部类的对象，再通过指向这个对象的引用来访问
 *　   5) 内部类可以拥有private访问权限、protected访问权限、public访问权限及包访问权限。
 *		如果成员内部类Inner用private修饰，则只能在外部类的内部访问，如果用public修饰，则任何地方都能访问；
 *		如果用protected修饰，则只能在同一个包下或者继承外部类的情况下访问；
 *		如果是默认访问权限，则只能在同一个包下访问。
 *		这一点和外部类有一点不一样，外部类只能被public和包访问两种权限修饰。
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
    
    private static String outerStaticVal = "外部类静态成员变量";
    private String outerVal = "外部类成员变量";
    
    class Inner{
        //内部类中不能出现静态变量
//      private static int innerStaticVal;
        private String innerVal = "内部类成员变量";
        
        public void print(){
            String innerVal = "局部变量与内部类成员变量重名";
            String innerLocalVal = "内部类方法局部变量";
            
            //内部类访问外部类的成员变量
            System.out.println(outerVal);
            //内部类访问外部类的成员变量的另一种方法
            System.out.println(Outer.this.outerVal);
            
            //内部类也可以访问外部类的静态成员变量
            System.out.println(Outer.outerStaticVal);
            
            //内部类可以访问自己的成员变量
            System.out.println(innerVal);
            //内部类访问自己的成员变量的另一种方法
            System.out.println(this.innerVal);
            
            //内部类方法访问局部变量
            System.out.println(innerLocalVal);
        }
    }
}