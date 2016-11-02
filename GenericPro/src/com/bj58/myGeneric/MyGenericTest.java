package com.bj58.myGeneric;

public class MyGenericTest {
	
	public static void main(String[] args) {
		// 1. 
//		Box<String> name = new Box<String>("corn");
//		System.out.println("name:" + name.getData());
		
		/**
		 * 2. ��ô���ڲ�ͬ���������ʵ�Σ����ɵ���Ӧ����ʵ����������һ����
		 * �����������߼��Ͽ��Կ����Ƕ����ͬ�����ͣ�ʵ���϶�����ͬ�Ļ�������
		Box<String> name = new Box<String>("corn");
		Box<Integer> age = new Box<Integer>(712);
		
		System.out.println("name class:" + name.getClass());      // com.qqyumidi.Box
		System.out.println("age class:" + age.getClass());        // com.qqyumidi.Box
		System.out.println(name.getClass() == age.getClass());    // true
		*/
		
		/**
		 * 3. Box<Number>��Box<Integer>ʵ���϶���Box���ͣ�������Ҫ����̽��һ�����⣬
		 * ��ô���߼��ϣ�������Box<Number>��Box<Integer>�Ƿ���Կ��ɾ��и��ӹ�ϵ�ķ���������
		 * ���߼���Box<Number>������ΪBox<Integer>�ĸ���
		
		Box<Number> name = new Box<Number>(99);
		Box<Integer> age = new Box<Integer>(712);
		
		getData(name);
		//The method getData(Box<Number>) in the type GenericTest is 
		//not applicable for the arguments (Box<Integer>)
		getData(age);
		 */
		
		/**
		 * 4. ����ͨ������ޡ�����ͨ�������
		 */
		Box<String> name = new Box<String>("corn");
		Box<Integer> age = new Box<Integer>(712);
		Box<Number> number = new Box<Number>(314);
		
		getData(name);
		getData(age);
		getData(number);
		
		// ����
//		getUpperNumberData(name);
		getUpperNumberData(age);
		getUpperNumberData(number);
		
		// ����
//		getSuperNumberData(name);
		// ����
//		getSuperNumberData(age);
		getSuperNumberData(number);
	}
	
	/**
	public static void getData(Box<Number> data){
		System.out.println("data :" + data.getData());
	}
	*/
	
	/**
	 * ����ͨ���
	 * @param data
	 */
	public static void getData(Box<?> data) {
		System.out.println("data :" + data.getData());
	}
	
	/**
	 * ����ͨ������ޣ�����Number���඼���ԣ�
	 * @param data
	 */
	public static void getUpperNumberData(Box<? extends Number> data){
		System.out.println("data :" + data.getData());
	}
	
	/**
	 * ����ͨ������ޣ�����Number���඼���ԣ�
	 * @param data
	 */
	public static void getSuperNumberData(Box<? super Number> data){
		System.out.println("data :" + data.getData());
	}
}

/**
 * ������
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