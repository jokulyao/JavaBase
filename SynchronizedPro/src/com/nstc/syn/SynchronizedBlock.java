package com.nstc.syn;

public class SynchronizedBlock {
	public static void main(String[] args){
        ExampleBlock example = new ExampleBlock();

        Thread t1 = new ThreadBlock1(example, "ThreadBlock1");
        Thread t2 = new ThreadBlock2(example, "ThreadBlock2");

        t1.start();
        t2.start();
    }
}


class ExampleBlock{
    private Object object = new Object();

    public void execute(){
        synchronized (object){
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

    public void execute2(){
        synchronized (object){
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
}

class ThreadBlock1 extends Thread{
    private ExampleBlock exampleBlock;

    public ThreadBlock1(ExampleBlock exampleBlock, String threadName){
    	super(threadName);
        this.exampleBlock = exampleBlock;
    }

    @Override
    public void run(){
    	exampleBlock.execute();
    }
}

class ThreadBlock2 extends Thread{
    private ExampleBlock exampleBlock;

    public ThreadBlock2(ExampleBlock exampleBlock, String threadName){
    	super(threadName);
        this.exampleBlock = exampleBlock;
    }

    @Override
    public void run(){
    	exampleBlock.execute2();
    }
}