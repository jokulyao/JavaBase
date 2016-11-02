package com.bj58.myGeneric;

public class MyGenericTest {
	
	public static void main(String[] args) {
		// 1. 
//		Box<String> name = new Box<String>("corn");
//		System.out.println("name:" + name.getData());
		
		/**
		 * 2. 那么对于不同传入的类型实参，生成的相应对象实例的类型是一样的
		 * 泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型
		Box<String> name = new Box<String>("corn");
		Box<Integer> age = new Box<Integer>(712);
		
		System.out.println("name class:" + name.getClass());      // com.qqyumidi.Box
		System.out.println("age class:" + age.getClass());        // com.qqyumidi.Box
		System.out.println(name.getClass() == age.getClass());    // true
		*/
		
		/**
		 * 3. Box<Number>和Box<Integer>实际上都是Box类型，现在需要继续探讨一个问题，
		 * 那么在逻辑上，类似于Box<Number>和Box<Integer>是否可以看成具有父子关系的泛型类型呢
		 * 在逻辑上Box<Number>不能视为Box<Integer>的父类
		
		Box<Number> name = new Box<Number>(99);
		Box<Integer> age = new Box<Integer>(712);
		
		getData(name);
		//The method getData(Box<Number>) in the type GenericTest is 
		//not applicable for the arguments (Box<Integer>)
		getData(age);
		 */
		
		/**
		 * 4. 类型通配符上限、类型通配符下限
		 */
		Box<String> name = new Box<String>("corn");
		Box<Integer> age = new Box<Integer>(712);
		Box<Number> number = new Box<Number>(314);
		
		getData(name);
		getData(age);
		getData(number);
		
		// 错误
//		getUpperNumberData(name);
		getUpperNumberData(age);
		getUpperNumberData(number);
		
		// 错误
//		getSuperNumberData(name);
		// 错误
//		getSuperNumberData(age);
		getSuperNumberData(number);
	}
	
	/**
	public static void getData(Box<Number> data){
		System.out.println("data :" + data.getData());
	}
	*/
	
	/**
	 * 类型通配符
	 * @param data
	 */
	public static void getData(Box<?> data) {
		System.out.println("data :" + data.getData());
	}
	
	/**
	 * 类型通配符上限（所有Number子类都可以）
	 * @param data
	 */
	public static void getUpperNumberData(Box<? extends Number> data){
		System.out.println("data :" + data.getData());
	}
	
	/**
	 * 类型通配符下限（所有Number父类都可以）
	 * @param data
	 */
	public static void getSuperNumberData(Box<? super Number> data){
		System.out.println("data :" + data.getData());
	}
}

/**
 * 泛型类
 * @author yaoxs
 * 
 * @param <T>
 */
class Box<T> {
	private T data;

	public Box() {
	}

	public Box(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}
}