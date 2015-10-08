package com.nstc.innerclass;

/**
 * 二、局部内部类
 * 局部内部类是定义在一个方法或者一个作用域里面的类，它和成员内部类的区别在于局部内部类的访问仅限于方法内或者该作用域内。
 * 注意，局部内部类就像是方法里面的一个局部变量一样，是不能有public、protected、private以及static修饰符的。
 * 局部内部类有一个优势，就是对外部世界完全的隐藏起来。
 * 局部类还有一个优势，可以访问局部变量。不过，局部变量必须声明为final。
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
    
    private static String outerStaticVal = "外部类静态成员变量";
    private String outerVal = "外部类成员变量";
    
    public void print(){
        class Inner{
            private String innerVal = "内部类成员变量";
//            private static String innerStaticVal = "内部类静态成员变量";
        }
        //访问局部内部类的成员变量
        System.out.println(new Inner().innerVal);
        
        //访问外部类的静态成员变量
        System.out.println(this.outerStaticVal);
        System.out.println(Outer2.outerStaticVal);
        //访问外部类的成员变量
        System.out.println(outerVal);
        System.out.println(this.outerVal);
    }
}  