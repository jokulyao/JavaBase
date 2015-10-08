package com.nstc.innerclass;

/**
 * 四.静态内部类（也叫嵌套内部类）
 * 
 *   1）使用内部类只是为了把一个类隐藏在另一个类的内部，并不需要内部类引用外围类的对象，可以将内部类声明为static，以便消除产生的引用。
 *   2）只有内部类可以声明为static。静态内部类的对象除了没有对生成它的外围类对象的引用特权外，与其他所有的内部类一样。
 *   3）静态内部类是不需要依赖于外部类的，这点和类的静态成员属性有点类似，并且它不能使用外部类的非static成员变量或者方法，
 *   	这点很好理解，因为在没有外部类的对象的情况下，可以创建静态内部类的对象，如果允许访问外部类的非static成员就会产生矛盾，因为外部类的非static成员必须依附于具体的对象。
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
    
    private static String outerStaticVal = "外部类静态成员变量";
    private String outerVal = "外部类成员变量";
    
    static class Inner{
        private static String innerStaticVal = "内部类静态成员变量";
        private String innerVal = "内部类成员变量";
        
        public void print(){
            String innerVal = "局部变量与内部类成员变量重名";
            String innerLocalVal = "内部类方法局部变量";
            
            //静态内部类无法访问外部类的成员变量
//            System.out.println(outerVal);
            //静态内部类无法访问外部类的成员变量
//            System.out.println(Outer.this.outerVal);
            
            //静态内部类可以访问外部类的静态成员变量
            System.out.println(Outer4.outerStaticVal);
            
            //静态内部类可以访问自己的成员变量
            System.out.println(innerVal);
            //静态内部类访问自己的成员变量的另一种方法
            System.out.println(this.innerVal);
            
            //静态内部类访问自己的静态成员变量
            System.out.println(innerStaticVal);
        }
    }
}