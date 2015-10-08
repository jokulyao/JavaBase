package com.nstc.syn;

/**
 * Java语言的关键字，当它用来修饰一个方法或者一个代码块的时候，能够保证在同一时刻最多只有一个线程执行该段代码。
 * 
 * synchronized 关键字，它包括两种用法：synchronized 方法和 synchronized 块。  
 * 1. synchronized 方法：通过在方法声明中加入 synchronized关键字来声明 synchronized 方法。如：  
 *		public synchronized void accessVal(int newVal);  
 *	synchronized 方法控制对类成员变量的访问：每个类实例对应一把锁，每个 synchronized 方法都必须获得调用该方法的类实例的锁方能
 *	执行，否则所属线程阻塞，方法一旦执行，就独占该锁，直到从该方法返回时才将锁释放，此后被阻塞的线程方能获得该锁，重新进入可执行
 *  状态。
 *  这种机制确保了同一时刻对于每一个类实例，其所有声明为 synchronized 的成员函数中至多只有一个处于可执行状态（因为至多只有
 *	一个能够获得该类实例对应的锁），从而有效避免了类成员变量的访问冲突（只要所有可能访问类成员变量的方法均被声明为 synchronized）。
 *
 *	在 Java 中，不光是类实例，每一个类也对应一把锁，这样我们也可将类的静态成员函数声明为 synchronized ，以控制其对类的静态成
 *	员变量的访问。
 *	synchronized 方法的缺陷：若将一个大的方法声明为synchronized 将会大大影响效率
 *
 * 2. synchronized 块：通过 synchronized关键字来声明synchronized 块。语法如下：  
 *		synchronized(syncObject) {  
 *		//允许访问控制的代码  
 *		}  
 *	synchronized 块是这样一个代码块，其中的代码必须获得对象 syncObject （如前所述，可以是类实例或类）的锁方能执行，具体机制同前所述。
 *  由于可以针对任意代码块，且可任意指定上锁的对象，故灵活性较高。  
 *  
 * synchronized方法实际上等同于用一个synchronized块包住方法中的所有语句，然后在synchronized块的括号中传入this关键字。
 * 当然，如果是静态方法，需要锁定的则是class对象。
 * 
 * ------------------------------------------------------------------------
 * 
 * 对synchronized(this)的一些理解:
 * 1)当两个并发线程访问同一个对象object中的这个synchronized(this)同步代码块时，一个时间内只能有一个线程得到执行。另一个线程必须等待当前线程执行完这个代码块以后才能执行该代码块。
 * 2)当一个线程访问object的一个synchronized(this)同步代码块时，另一个线程仍然可以访问该object中的非synchronized(this)同步代码块。
 * 3)尤其关键的是，当一个线程访问object的一个synchronized(this)同步代码块时，其他线程对object中所有其它synchronized(this)同步代码块的访问将被阻塞。
 * 4)第三个例子同样适用其它同步代码块。也就是说，当一个线程访问object的一个synchronized(this)同步代码块时，它就获得了这个object的对象锁。结果，其它线程对该object对象所有同步代码部分的访问都被暂时阻塞。
 * 5)以上规则对其它对象锁同样适用.
 * 
 * -------------------------------------------------------------------------
 * 
 * 1.synchronized关键字的作用域有二种： 
 *		1)是某个对象实例内，synchronized aMethod(){}可以防止多个线程同时访问这个对象的synchronized方法
 *		 	如果一个对象有多个synchronized方法，只要一个线程访问了其中的一个synchronized方法，其它线程不能同时访问这个对象中任何一个synchronized方法
 *		 	这时，不同的对象实例的synchronized方法是不相干扰的。也就是说，其它线程照样可以同时访问相同类的另一个对象实例中的synchronized方法
 *		2)是某个类的范围，synchronized static aStaticMethod{}防止多个线程同时访问这个类中的synchronized static方法。它可以对类的所有对象实例起作用。
 * 2.除了方法前用synchronized关键字，synchronized关键字还可以用于方法中的某个区块中，表示只对这个区块的资源实行互斥访问。
 * 		用法是: synchronized(this){区块}，它的作用域是当前对象；
 * 3.synchronized关键字是不能继承的，也就是说，基类的方法synchronized f(){} 在继承类中并不自动是synchronized f(){}，而是变成了f(){}。
 * 		继承类需要你显式的指定它的某个方法为synchronized方法；
 * 
 */

/**
 * 本例是同步方法
 * @author yaoxs
 *
 */
public class SynchronizedMethod {
    public static void main(String[] args){
    	ExampleMethod example = new ExampleMethod();

        Thread t1 = new ThreadMethod1(example, "Thread1");
        Thread t2 = new ThreadMethod2(example, "Thread2");

        t1.start();
        t2.start();
    }
}

class ExampleMethod{
    public synchronized void execute(){
        for (int i = 0; i < 20; ++i){
            try{
                Thread.sleep((long) Math.random() * 1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ", Hello: " + i);
        }
    }
    
    public synchronized void execute2(){
        for (int i = 0; i < 20; ++i){
            try{
                Thread.sleep((long) Math.random() * 1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ", Hello: " + i);
        }
    }
}

class ThreadMethod1 extends Thread{
    private ExampleMethod example;

    public ThreadMethod1(ExampleMethod example, String threadName){
    	super(threadName);
        this.example = example;
    }

    @Override
    public void run(){
        example.execute();
    }
}

class ThreadMethod2 extends Thread{
    private ExampleMethod example;

    public ThreadMethod2(ExampleMethod example, String threadName){
    	super(threadName);
        this.example = example;
    }

    @Override
    public void run(){
        example.execute2();
    }
}