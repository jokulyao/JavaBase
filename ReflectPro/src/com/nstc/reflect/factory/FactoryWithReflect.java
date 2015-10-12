package com.nstc.reflect.factory;

import com.nstc.reflect.factory.modal.Fruit;

public class FactoryWithReflect {
	public static void main(String[] args) {
		Fruit f = FactoryReflect.getInstance("com.nstc.reflect.factory.modal.Apple");
		if (f != null) {
			f.eat();
		}
	}
}

//	���칤���ࣨʹ���˷��䣩
//	ʹ�����ַ�ʽ������������������������ʱ�򣬹�����Ͳ���Ҫ�޸�
class FactoryReflect {
	public static Fruit getInstance(String ClassName) {
		Fruit f = null;
		try {
			f = (Fruit) Class.forName(ClassName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
