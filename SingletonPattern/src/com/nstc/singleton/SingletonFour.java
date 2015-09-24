package com.nstc.singleton;

/**
 * 静态内部类
 * 利用了classloder的机制来保证初始化instance时只有一个线程，
 * 它跟第三种方式不同的是（很细微的差别）：
 * 第三种方式是只要Singleton类被装载了，那么instance就会被实例化（没有达到lazy loading效果），
 * 而这种方式是Singleton类被装载了，instance不一定被初始化。
 * 因为SingletonHolder类没有被主动使用，只有显示通过调用getInstance方法时，
 * 才会显示装载SingletonHolder类，从而实例化instance。
 * 想象一下，如果实例化instance很消耗资源，我想让他延迟加载，
 * 另外一方面，我不希望在Singleton类加载时就实例化，
 * 因为我不能确保Singleton类还可能在其他的地方被主动使用从而被加载
 */
public class SingletonFour {
	private static class SingletonHolder {
		private static final SingletonFour INSTANCE = new SingletonFour();
	}

	private SingletonFour() {
	}

	public static final SingletonFour getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
