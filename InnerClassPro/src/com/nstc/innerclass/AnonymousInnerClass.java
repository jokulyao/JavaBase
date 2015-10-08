package com.nstc.innerclass;

/**
 * 三、匿名内部类（参考这篇文章Java中的匿名内部类总结）（实现回调的基本方法）
 * 1)将局部内部类的使用在深入一些，假如只创建内部类的一个对象，就不必命名了。
 * 2)由于构造器的名字与类名相同，而匿名类没有名字，因此匿名类不能有构造器。
 * 3)匿名内部类也是不能有访问修饰符和static修饰符的。
 * 4)匿名内部类是唯一一种没有构造器的类。正因为其没有构造器，所以匿名内部类的使用范围非常有限，大部分匿名内部类用于接口回调。匿名内部类在编译的时候由系统自动起名为Outter$1.class。一般来说，匿名内部类用于继承其他类或是实现接口，并不需要增加额外的方法，只是对继承方法的实现或是重写。
 * 5)使用匿名内部类还有个前提条件：必须继承一个父类或实现一个接口
 *   
 * @author yaoxs
 *
 */
public class AnonymousInnerClass {
	public static void main(String[] args){
        Person person = new Person() {
            public void eat() {
                System.out.println("eat");
            }
        };
        person.eat();
    }
}

interface Person{
    public void eat();
}
