package com.nstc.initialorder;

/**
 * 对于(静态变量和静态初始化块之间)、(变量和初始化块之间)的先后顺序又是怎样呢？
 * 实际上这取决于它们在类中出现的先后顺序。
 * 我们以静态变量和静态初始化块为例来进行说明
 * 同样，变量和初始化块也遵循这个规律
 */

public class TestOrder { 
    // 静态变量        
    public static TestA a = new TestA();        
    
    // 静态变量
    public static TestB b = new TestB();        
 
    // 静态初始化块        
    static {        
        System.out.println("静态初始化块");        
    }        
 
    public static void main(String[] args) {        
        new TestOrder();        
    }        
}        
 
class TestA {        
    public TestA() {        
        System.out.println("Test--A");        
    }        
}        
 
class TestB {        
    public TestB() {        
        System.out.println("Test--B");        
    }        
}       
