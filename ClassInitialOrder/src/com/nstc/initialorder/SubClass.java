package com.nstc.initialorder;

/**
 * 对于继承情况下，并不是父类完全初始化完毕后才进行子类的初始化
 * 实际上子类的静态变量和静态初始化块的初始化是在父类的变量、初始化块和构造器初始化之前就完成了
 *
 */

class Parent {        
    // 静态变量        
    public static String p_StaticField = "父类ParentClass--静态变量";        
    // 变量        
    public String p_Field = "父类ParentClass--变量";        
 
    // 静态初始化块
    static {        
        System.out.println(p_StaticField);        
        System.out.println("父类ParentClass--静态初始化块");        
    }        
 
    // 初始化块
    {        
        System.out.println(p_Field);        
        System.out.println("父类ParentClass--初始化块");        
    }        
 
    // 构造器
    public Parent() {        
        System.out.println("父类ParentClass--构造器");        
    }        
}        
 
public class SubClass extends Parent {        
    // 静态变量
    public static String s_StaticField = "子类SubClass--静态变量";        
    // 变量
    public String s_Field = "子类SubClass--变量";        
    // 静态初始化块        
    static {        
        System.out.println(s_StaticField);        
        System.out.println("子类SubClass--静态初始化块");        
    }        
    // 初始化块        
    {        
        System.out.println(s_Field);        
        System.out.println("子类SubClass--初始化块");        
    }        
 
    // 构造器        
    public SubClass() {        
        System.out.println("子类SubClass--构造器");        
    }        
 
    // 程序入口        
    public static void main(String[] args) {        
        new SubClass();        
    }        
}     