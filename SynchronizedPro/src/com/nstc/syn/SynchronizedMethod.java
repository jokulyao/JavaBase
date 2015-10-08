package com.nstc.syn;

/**
 * Java���ԵĹؼ��֣�������������һ����������һ��������ʱ���ܹ���֤��ͬһʱ�����ֻ��һ���߳�ִ�иöδ��롣
 * 
 * synchronized �ؼ��֣������������÷���synchronized ������ synchronized �顣  
 * 1. synchronized ������ͨ���ڷ��������м��� synchronized�ؼ��������� synchronized �������磺  
 *		public synchronized void accessVal(int newVal);  
 *	synchronized �������ƶ����Ա�����ķ��ʣ�ÿ����ʵ����Ӧһ������ÿ�� synchronized �����������õ��ø÷�������ʵ����������
 *	ִ�У����������߳�����������һ��ִ�У��Ͷ�ռ������ֱ���Ӹ÷�������ʱ�Ž����ͷţ��˺��������̷߳��ܻ�ø��������½����ִ��
 *  ״̬��
 *  ���ֻ���ȷ����ͬһʱ�̶���ÿһ����ʵ��������������Ϊ synchronized �ĳ�Ա����������ֻ��һ�����ڿ�ִ��״̬����Ϊ����ֻ��
 *	һ���ܹ���ø���ʵ����Ӧ���������Ӷ���Ч���������Ա�����ķ��ʳ�ͻ��ֻҪ���п��ܷ������Ա�����ķ�����������Ϊ synchronized����
 *
 *	�� Java �У���������ʵ����ÿһ����Ҳ��Ӧһ��������������Ҳ�ɽ���ľ�̬��Ա��������Ϊ synchronized ���Կ��������ľ�̬��
 *	Ա�����ķ��ʡ�
 *	synchronized ������ȱ�ݣ�����һ����ķ�������Ϊsynchronized ������Ӱ��Ч��
 *
 * 2. synchronized �飺ͨ�� synchronized�ؼ���������synchronized �顣�﷨���£�  
 *		synchronized(syncObject) {  
 *		//������ʿ��ƵĴ���  
 *		}  
 *	synchronized ��������һ������飬���еĴ�������ö��� syncObject ����ǰ��������������ʵ�����ࣩ��������ִ�У��������ͬǰ������
 *  ���ڿ�������������飬�ҿ�����ָ�������Ķ��󣬹�����Խϸߡ�  
 *  
 * synchronized����ʵ���ϵ�ͬ����һ��synchronized���ס�����е�������䣬Ȼ����synchronized��������д���this�ؼ��֡�
 * ��Ȼ������Ǿ�̬��������Ҫ����������class����
 * 
 * ------------------------------------------------------------------------
 * 
 * ��synchronized(this)��һЩ���:
 * 1)�����������̷߳���ͬһ������object�е����synchronized(this)ͬ�������ʱ��һ��ʱ����ֻ����һ���̵߳õ�ִ�С���һ���̱߳���ȴ���ǰ�߳�ִ�������������Ժ����ִ�иô���顣
 * 2)��һ���̷߳���object��һ��synchronized(this)ͬ�������ʱ����һ���߳���Ȼ���Է��ʸ�object�еķ�synchronized(this)ͬ������顣
 * 3)����ؼ����ǣ���һ���̷߳���object��һ��synchronized(this)ͬ�������ʱ�������̶߳�object����������synchronized(this)ͬ�������ķ��ʽ���������
 * 4)����������ͬ����������ͬ������顣Ҳ����˵����һ���̷߳���object��һ��synchronized(this)ͬ�������ʱ�����ͻ�������object�Ķ�����������������̶߳Ը�object��������ͬ�����벿�ֵķ��ʶ�����ʱ������
 * 5)���Ϲ��������������ͬ������.
 * 
 * -------------------------------------------------------------------------
 * 
 * 1.synchronized�ؼ��ֵ��������ж��֣� 
 *		1)��ĳ������ʵ���ڣ�synchronized aMethod(){}���Է�ֹ����߳�ͬʱ������������synchronized����
 *		 	���һ�������ж��synchronized������ֻҪһ���̷߳��������е�һ��synchronized�����������̲߳���ͬʱ��������������κ�һ��synchronized����
 *		 	��ʱ����ͬ�Ķ���ʵ����synchronized�����ǲ�����ŵġ�Ҳ����˵�������߳���������ͬʱ������ͬ�����һ������ʵ���е�synchronized����
 *		2)��ĳ����ķ�Χ��synchronized static aStaticMethod{}��ֹ����߳�ͬʱ����������е�synchronized static�����������Զ�������ж���ʵ�������á�
 * 2.���˷���ǰ��synchronized�ؼ��֣�synchronized�ؼ��ֻ��������ڷ����е�ĳ�������У���ʾֻ������������Դʵ�л�����ʡ�
 * 		�÷���: synchronized(this){����}�������������ǵ�ǰ����
 * 3.synchronized�ؼ����ǲ��ܼ̳еģ�Ҳ����˵������ķ���synchronized f(){} �ڼ̳����в����Զ���synchronized f(){}�����Ǳ����f(){}��
 * 		�̳�����Ҫ����ʽ��ָ������ĳ������Ϊsynchronized������
 * 
 */

/**
 * ������ͬ������
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