package com.bj58.artconcurrent.chapter04;

/**
 * 6-10
 */
public class Synchronized {
    public static void main(String[] args) {
        // ��Synchronized Class������м���
        synchronized (Synchronized.class) {

        }
        // ��̬ͬ����������Synchronized Class������м���
        m();
    }

    public static synchronized void m() {
    }
}
