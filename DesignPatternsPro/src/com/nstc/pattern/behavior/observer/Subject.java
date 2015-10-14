package com.nstc.pattern.behavior.observer;

/**
 * �۲���ģʽ
 * @author yaoxs
 */

public interface Subject {

	/* ���ӹ۲��� */
	public void add(Observer observer);

	/* ɾ���۲��� */
	public void del(Observer observer);

	/* ֪ͨ���еĹ۲��� */
	public void notifyObservers();

	/* ����Ĳ��� */
	public void operation();
}