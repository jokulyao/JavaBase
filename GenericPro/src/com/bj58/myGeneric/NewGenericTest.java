package com.bj58.myGeneric;

public class NewGenericTest {
	public static void main(String[] args) {
		Info<String, String> info = new Info<String, String>("汤姆", "杰瑞");
		Container<Info<String, String>> a = new Container<Info<String, String>>(info);
		System.out.println(a.getInfo().getKey());
		System.out.println(a.getInfo().getValue());
		
		Container<String> container = new Container<String>("container");
		fun(container);
		
		Container<Integer> container2 = new Container<Integer>(2);
		Container<Number> container3 = new Container<Number>(3);
		make(container2);
		make(container3);
		
		Container<String> container4 = new Container<String>("key");
		Container<String> container5 = new Container<String>("value");
		Info<String, String> info2 = build(container4, container5);
		System.out.println(info2.getKey() + " " + info2.getValue());
		
		print2(print("a", "b", "c"));
	}
	
	/**
	 * 泛型通配符
	 * @param container
	 */
	public static void fun(Container<?> container){
		System.out.println(container.getInfo());
	}
	
	/**
	 * 受限泛型方法
	 * @param container
	 */
	public static void make(Container<? extends Number> container){
		System.out.println(container.getInfo());
	}
	
	/**
	 * 泛型方法
	 * @param container
	 * @return
	 */
	public static <K, V> Info<K, V> build(Container<K> container, Container<V> container2){
		Info<K, V> info = new Info<K, V>(container.getInfo(), container2.getInfo());
		return info;
	}
	
	/**
	 * 可变长参数
	 * @param args
	 * @return
	 */
	public static <T> T[] print(T...args){
		return args;
	}
	
	public static <T> void print2(T[] params){
		for(T t : params){
			System.out.println(t);
		}
	}
}

/**
 * 泛型类
 * @author yaoxs
 *
 * @param <K>
 * @param <V>
 */
class Info<K, V> {
	private K key;
	private V value;

	public Info(K key, V value) {
		this.setKey(key);
		this.setValue(value);
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

/**
 * 嵌套泛型类
 * @author yaoxs
 *
 * @param <I>
 */
class Container<I>{
	private I info;
	
	public Container(I info){
		this.info = info;
	}

	public I getInfo() {
		return info;
	}

	public void setInfo(I info) {
		this.info = info;
	}
}