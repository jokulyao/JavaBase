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

//	构造工厂类（使用了反射）
//	使用这种方式，就算我们添加任意多个子类的时候，工厂类就不需要修改
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
