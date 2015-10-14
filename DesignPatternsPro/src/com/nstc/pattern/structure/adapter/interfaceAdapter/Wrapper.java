package com.nstc.pattern.structure.adapter.interfaceAdapter;

/**
 * ������Wrapper�����࣬�ó�����ʵ����Sourceable�ӿڣ�ʵ�������еķ�����
 * �Ժ�����Sourceable�ӿڵ�����(SourceSub1��SourceSub2)���̳�Wrapper�����ֻ࣬�͸ó�����ȡ����ϵ
 * @author yaoxs
 */

public abstract class Wrapper implements Sourceable {

	@Override
	public void sourceableMethod1() {}

	@Override
	public void sourceableMethod2() {}
}
